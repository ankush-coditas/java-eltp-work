package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddServlet() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest req , HttpServletResponse res ) throws ServletException, IOException {
	  
		 res.setContentType("text/html");
	    PrintWriter pw  = res.getWriter();
	int n1 = Integer.parseInt(req.getParameter("no1"));
	int n2 = Integer.parseInt(req.getParameter("no2"));
	pw.println("<h2> The addition of the numbers is "+(n1+n2)+"<h2>");
		 
	}
 
	protected void doPost(HttpServletRequest req  , HttpServletResponse res ) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req , res );
	}

}
