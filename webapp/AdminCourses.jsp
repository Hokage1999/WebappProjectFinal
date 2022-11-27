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
<form action="AdminServlet" method="get">
Enter the CourseName to add:<input type="text"  name="courseName"><br><br>
<input type="submit" value="ADD">
</form><br><br>
<form action="RemovingServlet" method="get">
Enter the CourseName to remove:<input type="text"  name="courseName"><br><br>
<input type="submit" value="REMOVE">
</form>
</body>
</html>