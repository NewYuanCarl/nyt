<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
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
			$("#ename").keyup(function(){
				$.post("ec/checkname",{"ename":$(this).val},function(data){
					//console.log(typeof(data));
					if(data){
						$("#nameinfo").html("<font color='red' size='2'><b>用户名已存在</b></font>");
					}else{
						$("#nameinfo").html("<font color='green' size='2'><b>用户名可以使用</b></font>");	
					}		
				},"json");
			});
			
		});
</script>
</head>
<body>
<h2>增加员工页面</h2>
<form >
	用户名：<input type="text" value="lisi" name="ename" id="ename"/>
		<span id="nameinfo"></span>
	<br/>
	职位:<input type="text" value="程序员" name="job" /><br/>
	入职时间:<input type="text" value="2017-03-20" name="hiredate"/><br/>
	部门:<select name="dept.deptno">
				<option value="0">----请选择部门---</option>
				<c:forEach items="${deptlist}" var="d">
				<option value="${d.deptno}">${d.dname }</option>
				</c:forEach>
	</select><br/>
	<input type="submit" value="增加"/><br/>
</form>
</body>
</html>