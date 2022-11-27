<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	if(session.getAttribute("uname")==null)
	{
		response.sendRedirect("Login.jsp");
	}
%>
welcome ${uname}
<form action="LogoutServlet" method="get">
	<input type="submit" value="Logout">
</form>
<br><br>

<form action="ListofCourses.jsp" method="get">
	<input type="submit" value="Courses">
</form>
<br><br>

<form action="BucketofCourses" method="get">
	<input type="submit" value="BucketofCourses">
</form>
<br><br>

<form action="DropCourses.jsp" method="get">
	<input type="submit" value="DropCourses">
</form>
<br><br>

</body>
</html>