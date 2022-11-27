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

public class LearningsServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		List<String> courses = new ArrayList<>();
		String courseName = request.getParameter("courseName");
		HttpSession session = request.getSession();
		String uname = (String)session.getAttribute("uname");
		PrintWriter out = response.getWriter();
		courseName = courseName.toUpperCase();
		if(Courses.defaultCourses().contains(courseName)||AdminCourses.adminCourses.contains(courseName))
		{
			
		boolean x = Cred.addCourses(uname,courseName);
			if(x==true)
			{
				out.println("Course "+ courseName +" is added");
			}
			else
			{
				out.println("Course "+ courseName +" is already in your bucket.Please choose any other one");
			}
		}
		else
		{
			out.println("Not in list");	
		}

}
}
