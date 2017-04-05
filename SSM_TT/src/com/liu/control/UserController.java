package com.liu.control;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.liu.biz.IUserBiz;
import com.liu.pojo.Users;



@Controller
@RequestMapping("uc")
public class UserController {

	private IUserBiz userBizImpl;
	
	@RequestMapping(value="islogin",method=RequestMethod.POST)
	public ModelAndView checklogin(Users user,HttpSession session){
		ModelAndView mav = new ModelAndView();
		
		Users u = userBizImpl.islogin(user);
		String myurl = "index";
		if(u!=null){
			//myurl = "forward:/ec/findallemp";
			myurl = "main";
			session.setAttribute("users", u);
		}
		mav.setViewName(myurl);
		mav.addObject("u", u);
		return mav;
	}

	public IUserBiz getUserBizImpl() {
		return userBizImpl;
	}

	public void setUserBizImpl(IUserBiz userBizImpl) {
		this.userBizImpl = userBizImpl;
	}
}
