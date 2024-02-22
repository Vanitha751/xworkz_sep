package com.xworkz.ticketbookingmanagementsystem.servlet;

import javax.servlet.GenericServlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class TicketBookingManageMentSystem extends GenericServlet{

	public TicketBookingManageMentSystem() {
		System.out.println("This is an constructor");
	}
	@Override
	public void service(ServletRequest request, ServletResponse response)  {
		System.out.println("this is an service method of generic servlet");
		
		System.out.println(request.getParameter("UserName"));
		String userName=request.getParameter("UserName");
		System.out.println("UserName:"+userName);
		
	    String emailId=request.getParameter("EmailId");
	    System.out.println("EmailId:"+emailId);
	    
	    String contactNum=request.getParameter("ContactNumber");
	    System.out.println("ContactNumber:"+contactNum);
	    
	    String alternateContactNum=request.getParameter("AlternateContactNumber");
	    System.out.println("AlternateContactNum:"+alternateContactNum);
	    
	    String age=request.getParameter("age");
	    System.out.println("Age:"+age);
	    
	    String gender=request.getParameter("gender");
	    System.out.println("Gender:"+gender);
	    
	   String place =request.getParameter("place");	
	    System.out.println("place:"+place);
	}
}
