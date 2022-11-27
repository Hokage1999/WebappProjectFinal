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
//
public class BucketofCourses extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
	PrintWriter out =response.getWriter();	
	List<String>courses = new ArrayList<>();
	HttpSession session = request.getSession();
	String uname = (String)session.getAttribute("uname");
	courses = Cred.returnCourses(uname);
	if(courses.isEmpty())
	{
	out.println("You haven't added any courses yet");
	}
	else
	{
	for(String s:courses)
	{
		out.println(s);
	}
	}
}
}