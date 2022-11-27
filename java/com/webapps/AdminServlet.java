package com.webapps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	String courseName = request.getParameter("courseName");	
	courseName = courseName.toUpperCase();
	boolean x = AdminCourses.adminAddCourses(courseName);	
	if(x==true)
	{
		out.println("Course added");
	}
	else
	{
		out.println("course is already there");
	}
	}
}
