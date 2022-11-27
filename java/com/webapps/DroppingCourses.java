package com.webapps;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DroppingCourses extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	String courseName = request.getParameter("courseName");
	HttpSession session = request.getSession();
	String uname = (String)session.getAttribute("uname");
	courseName = courseName.toUpperCase();
	if(Cred.returnCourses(uname).contains(courseName))
	{
	Cred.removeCourses(uname,courseName);
	out.println(courseName+" is dropped");
	}
	else
	{
		out.println("You have not choosed "+courseName);
	}
	}
}
