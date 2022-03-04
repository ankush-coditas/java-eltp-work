package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter pw =response.getWriter();
		 String uname = request.getParameter("username");
		 String pass = request.getParameter("password");
		 if(uname.equals(pass)) {
			 pw.println("<h2>Login Successful</h2>");
			 pw.println("<h3><a href='dataInsert.html'</a>Insert data</h3>");
		 }
	}

	 
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
