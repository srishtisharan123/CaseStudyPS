package com.srishti.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.srishti.beans.Customer;
import com.srishti.connection.GetConnection;

public class RegistrationUtil {

	public boolean checkName(String name) {
		return ((name != null) && (name.length() >= 3) && (name.matches("^[a-zA-Z]*$")));
	}

	public boolean checkEmail(String email) {

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();

	}

	public boolean checkPassword(String password) {

		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";

		Pattern p = Pattern.compile(regex);

		if (password == null) {
			return false;
		}

		Matcher m = p.matcher(password);

		return m.matches();
	}

	public boolean checkConfirmPassword(String password, String cPassword) {
		return cPassword.equals(password);
	}

	public boolean checkIfUserExist(String username) {

		String sql = "select cust_name from customers where cust_name=?";
		try (PreparedStatement prepareStatement = GetConnection.getMySql().prepareStatement(sql);) {

			prepareStatement.setString(1, username);
			ResultSet rs = prepareStatement.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkIfEmailExist(String email) {

		String sql = "select cust_name from customers where email=?";
		try (PreparedStatement prepareStatement = GetConnection.getMySql().prepareStatement(sql);) {

			prepareStatement.setString(1, email);
			ResultSet rs = prepareStatement.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
