package com.nt.country;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectCountry extends HttpServlet {

	String[] india={"odisha","kerala","hyd"};
	String[] usa={"odisha","kerala","hyd"};
	String[] eng={"odisha","kerala","hyd"};
	
	PrintWriter  writter=null;
	String country=null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//set content type
		resp.setContentType("text/html");
		//printwritter
		writter=resp.getWriter();
		//read frm data
		country=req.getParameter("country");
		if(country.equalsIgnoreCase("india")){
			writter.println("india states are  "+Arrays.toString(india));
		}
		else if(country.equalsIgnoreCase("usa")){
			writter.println("usa states are  "+Arrays.toString(usa));
		}
		else if(country.equalsIgnoreCase("eng")){
			writter.println("eng states are  "+Arrays.toString(eng));
		}
		
		writter.println("<br><a href='index.jsp'>home</a>");
		//close steram
		writter.close();
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp); 
	}
	
	
}
