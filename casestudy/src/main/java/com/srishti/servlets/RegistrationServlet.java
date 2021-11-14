package com.srishti.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srishti.beans.Customer;
import com.srishti.dao.CustomerDAO;
import com.srishti.service.CustomerService;
import com.srishti.util.RegisterCustomer;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

	private CustomerDAO customerDao;

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		customerDao = new CustomerDAO();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Customer cust = (Customer) req.getSession().getAttribute("customer");
		if (cust != null) {
			resp.sendRedirect("./dashboard");
			return;
		}

		req.getRequestDispatcher("/WEB-INF/views/registration-form.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Customer customer = RegisterCustomer.doRegistration(request);
		CustomerService custService = new CustomerService();
		boolean registerFlag = custService.insertCustomer(customer);
		if (registerFlag) {
			try {
				customerDao.insertCustomer(customer);
				request.getSession().setAttribute("customer", customer);
				response.sendRedirect("./dashboard");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// invoke the registration page with error message
			request.getRequestDispatcher("/WEB-INF/views/registration-form.jsp").forward(request, response);
		}

	}
}
