<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page import="java.util.*"%>  
<%@page import="com.webapps.Cred"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
List of Courses:
<%
	if(session.getAttribute("uname")==null)
	{
		response.sendRedirect("Login.jsp");
	}
	else
	{		
	String uname = (String)session.getAttribute("uname");
	List<String> courses = new ArrayList<>();
	courses = Cred.returnCourses(uname);
	for(String s:courses)
	{
		out.println(s+"<br />");
	}
		}
%><br><br>
<form action="DroppingCourses" method="get">
Enter the course to Drop:<input type="text"  name="courseName"><br>
						<input type="submit" value="submit">
</form>

</body>
</html>