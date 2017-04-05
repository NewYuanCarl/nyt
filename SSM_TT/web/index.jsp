<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" >
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">

		$(function(){
			$("loginname").blur(function(){
				if($(this).val()==""){
					$("#nameinfo").html("<font color='red' size='2'>用户名不能为空</font>");
				}
			});	
		});
</script>
</head>
<body>
<h2>欢迎进入本系统</h2>
<form action="uc/islogin" method="post">
	用户名:<input type="text" value="zhangsan" name="loginname" id="loginname"/> 
	     <span id="nameinfo"></span> <br/>
	密码:<input type="password" value="123" name="loginpwd"/><br/>
        <input type="submit" value="登录"/><br/>
</form>
</body>
</html>