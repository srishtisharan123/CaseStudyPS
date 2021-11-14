package com.srishti.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.srishti.beans.Customer;
import com.srishti.connection.GetConnection;

public class CustomerDAO implements ICustomerDAO {

	@Override
	public boolean insertCustomer(Customer customer) throws SQLException {

		String sql = "insert into customers values(?,?,?,?,?)";
		try (PreparedStatement prepareStatement = GetConnection.getMySql().prepareStatement(sql);) {
			prepareStatement.setString(1, customer.getUsername());
			prepareStatement.setString(2, customer.getPassword());
			prepareStatement.setString(3, customer.getcPassword());
			prepareStatement.setString(4, customer.getEmail());
			prepareStatement.setString(5, customer.getGender());
			return prepareStatement.executeUpdate() > 0;
		}
	}

	@Override
	public Customer getCustomer(String username, String password) {
		String sql = "select cust_name,password,confirm_password,email,gender from customers where cust_name=? and password=?";

		try (PreparedStatement prepareStatement = GetConnection.getMySql().prepareStatement(sql);) {

			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			ResultSet resultSet1 = prepareStatement.executeQuery();
			if (resultSet1.next()) {
				return new Customer(username, password, resultSet1.getString(3),
						resultSet1.getString(4), resultSet1.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
