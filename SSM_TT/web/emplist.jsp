<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"   %>
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
</head>
<body>
<h2>显示所有用户信息</h2>
<table width="800" border="1" cellspacing="0">
		<tr>
				<th>编号</th>
				<th>名字</th>
				<th>职位</th>
				<th>入职日期</th>
				<th>工资</th>
				<th>部门</th>
		</tr>
		<c:forEach items="${emplist}" var="e">
			<tr>
			     <td>${e.empno}</td>
			     <td>${e.ename}</td>
			     <td>${e.job}</td>
			     <td><fmt:formatDate value="${e.hiredate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			     <td>${e.empno}</td>
			     <td>${e.empno}</td>
			</tr>
		</c:forEach>
</table>
</body>
</html>