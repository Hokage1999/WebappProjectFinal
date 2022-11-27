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
boolean x =(boolean) session.getAttribute("x");
if(x==true)
{
	out.println("signup Success");
}
else
{
	out.println("Sry youre already signed in...Please login");
}
%>

</body>
</html>