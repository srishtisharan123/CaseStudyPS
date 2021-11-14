package com.srishti.dao;

import java.sql.SQLException;

import com.srishti.beans.Customer;

public interface ICustomerDAO {
	boolean insertCustomer(Customer customer) throws SQLException; 
	Customer  getCustomer(String username, String password); 

}
