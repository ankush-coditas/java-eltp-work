package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class InsertDataServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    
    public InsertDataServlet() {
        super();
       
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	      try {
	    	  response.setContentType("text/html");
	 		 PrintWriter pw = response.getWriter();
	 		   ServletContext sc = getServletContext();
         Class.forName(sc.getInitParameter("dbname"));
	 		 
		 	Connection con = DriverManager.getConnection(sc.getInitParameter("dburl"),sc.getInitParameter("dbn"),sc.getInitParameter("dbpass"));
		 	 PreparedStatement ps =  con.prepareStatement("insert into stable values (?,?,?)");
		 	 ps.setInt(1,Integer.parseInt(request.getParameter("id")) );
		 	 ps.setString(2,request.getParameter("name") );
		 	 ps.setString(3,request.getParameter("dept"));
		 	boolean isInserted = ps.execute();
		 	if(isInserted) {
		 		pw.println("<h3>Data is Inserted</h3>");
		 	} else {
		 		pw.println("<h3>Data is not Inserted</h3>");
		 	}
		 	 
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
