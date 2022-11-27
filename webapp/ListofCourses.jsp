<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%> 
<%@page import="com.webapps.AdminCourses"%>
<%@page import="com.webapps.Courses"%>
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
List of Courses<br><br>

<%
List<String>defaultCourses = new ArrayList<>();
defaultCourses = Courses.defaultCourses(); 
for(String s:defaultCourses)
{
	out.println(s+"<br />");
}
List<String>adminCourses = new ArrayList<>();
adminCourses = AdminCourses.returnAdminCourses(); 
for(String s:adminCourses)
{
	out.println(s+"<br />");
}%>
<form action="LearningsServlet" method="get">
Enter the CourseName:<input type="text"  name="courseName"><br><br>
<input type="submit" value="submit">
</form>

</body>
</html>