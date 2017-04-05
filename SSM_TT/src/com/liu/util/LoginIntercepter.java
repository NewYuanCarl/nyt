package com.liu.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class LoginIntercepter extends HandlerInterceptorAdapter {
	private static String [] arr = {
		"uc/islogin",
		"uc/isreg"
	};
	
	public boolean checkUrl(String url){
		//如果当前的请求路径包含在arr数组中，那么返回true
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(url)){
				return true;
			}
		}
		
		//再次判断，如果是资源文件，也应该返回true
		if(url!=null&&!"".equals(url)&&url.endsWith(".js")){
			return true;
		}
		return false;
	}
	
	/**
	 * 实际业务方法执行之前的操作,返回一个boolean值
	 * 如果返回true,表示拦截器通过拦截，继续执行我的业务方法
	 * 如果返回false,表示拦截器拦截停止，不再执行后续业务方法
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("1.业务方法执行之前的操作");
		
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("users");
		
		//获取当前请求的名字
		String uri = request.getRequestURI();
		String contextpath = request.getContextPath();
		String url = uri.substring(contextpath.length()+1, uri.length());
		
		if(obj==null){
			
			if(this.checkUrl(url)){
				return true;
			}
			String path = request.getContextPath();
			String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
			response.sendRedirect(basePath+"index.jsp");
			//request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
		//权限验证
		return true;
	}
	
	/**
	 * 业务方法执行完毕后继续执行的内容
	 * 此方法要想执行，前面的preHandle方法必须返回true
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("2.业务方法执行之后要做的操作");
	}
	
	/**
	 * 本次请求中所有的操作都完成了之后要进行的操作
	 * 一般用来释放资源
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("3.请求完成之后的操作");
	}
}
