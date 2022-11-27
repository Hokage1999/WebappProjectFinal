package com.webapps; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opencsv.CSVWriter;


public class SignupServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		String mobileNo = request.getParameter("mobileNo");
		
		

		if(pass.equals(repass))
		{
		
		Cred a = new Cred(uname,pass,mobileNo);
		a.addList(a);
		boolean x = a.signup(a);
		HttpSession session = request.getSession();
		session.setAttribute("x",x);
		response.sendRedirect("Success.jsp"); 
		}
		
		else
		{
			response.sendRedirect("Resetwrong.jsp");
		}
		
			
		

}
}


