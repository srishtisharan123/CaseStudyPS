package com.srishti.util;

import javax.servlet.http.HttpServletRequest;

import com.srishti.beans.Customer;

public class RegisterCustomer {
	
	public static Customer doRegistration(HttpServletRequest request) {
		Customer customer=new Customer();
		customer.setUsername(request.getParameter("username"));
		customer.setPassword(request.getParameter("password"));
		customer.setcPassword(request.getParameter("cpassword"));
		customer.setEmail(request.getParameter("email"));
		customer.setGender(request.getParameter("gender"));
		
		System.out.println(customer);
		return customer;
		
		
	}

}
