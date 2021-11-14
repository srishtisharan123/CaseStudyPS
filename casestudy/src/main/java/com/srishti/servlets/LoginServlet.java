package com.srishti.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srishti.beans.Customer;
import com.srishti.dao.CustomerDAO;
import com.srishti.service.CustomerService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private CustomerDAO cust;
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		cust = new CustomerDAO();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Customer customer = (Customer) req.getSession().getAttribute("customer");
		if (customer != null) {
			resp.sendRedirect("./dashboard");
			return;
		}

		req.getRequestDispatcher("/WEB-INF/views/login-form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Customer customer = cust.getCustomer(username, password);

		if (customer == null) {
			req.getRequestDispatcher("/WEB-INF/views/login-form.jsp").forward(req, resp);
			System.out.println(customer);
		} else {
			req.getSession().setAttribute("customer", customer);
			resp.sendRedirect("./dashboard");
			System.out.println(customer);
		}
	}

}
