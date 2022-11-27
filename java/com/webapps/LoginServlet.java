package com.webapps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		
	//s2c	boolean x = false;
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		//s2c x = LoginFileRead.loginCheck(uname, pass);
		
		//s2c if(x==true)
		
	
		if(Cred.loginCheck(uname, pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname",uname);
			response.sendRedirect("Welcome.jsp");
		}
		else if(uname.equals("qw")&&pass.equals("1"))
		{
			response.sendRedirect("AdminCourses.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}
}
}


