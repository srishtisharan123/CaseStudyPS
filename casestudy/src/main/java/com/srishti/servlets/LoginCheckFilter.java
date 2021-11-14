package com.srishti.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srishti.beans.Customer;

@WebFilter(urlPatterns = { "/dashboard" })
public class LoginCheckFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		Customer customer = (Customer) request.getSession().getAttribute("customer");

		if (customer == null) {
			response.sendRedirect("./login");
			return;
		}
		chain.doFilter(request, response);
	}

}
