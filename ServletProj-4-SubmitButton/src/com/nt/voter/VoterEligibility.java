package com.nt.voter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterEligibility extends HttpServlet {

	String NAME=null,tage=null;
	int AGE=0;
	
	PrintWriter writter=null;
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//set content type
		resp.setContentType("text/html");
		//printeritter
		writter=resp.getWriter();
		//read form data
		NAME=req.getParameter("name");
		tage=req.getParameter("age");
		AGE=Integer.parseInt(tage);
		if (AGE<=18){
			writter.println("u r not elligable   "+NAME);	
		}
		else if (AGE>18){
			writter.println("u r elligable"+NAME);	
		}
		
		
		//close stream
		writter.close();
		
		
		
		
	}
	
	
	
}
