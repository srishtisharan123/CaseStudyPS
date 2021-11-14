package com.srishti.service;

import com.srishti.beans.Customer;
import com.srishti.exception.ConfirmPasswordException;
import com.srishti.exception.EmailAlreadyExistException;
import com.srishti.exception.EmailException;
import com.srishti.exception.NameTooShortException;
import com.srishti.exception.PasswordException;
import com.srishti.exception.UserAlreadyExistException;
import com.srishti.util.RegistrationUtil;

public class CustomerService implements ICustomerService {

	@Override
	public boolean insertCustomer(Customer customer) {
		RegistrationUtil regUtil = new RegistrationUtil();
		int flag = 0;
		try {
			if (!regUtil.checkName(customer.getUsername())) {
				flag++;
				throw new NameTooShortException();
			}
			if (!regUtil.checkPassword(customer.getPassword())) {
				flag++;
				throw new PasswordException();
			}
			if (!regUtil.checkConfirmPassword(customer.getPassword(), customer.getcPassword())) {
				flag++;
				throw new ConfirmPasswordException();
			}
			if (!regUtil.checkEmail(customer.getEmail())) {
				flag++;
				throw new EmailException();
			}
			if (regUtil.checkIfUserExist(customer.getUsername())) {
				flag++;
				throw new UserAlreadyExistException();
			}
			if (regUtil.checkIfEmailExist(customer.getEmail())) {
				flag++;
				throw new EmailAlreadyExistException();
			}
		} catch (NameTooShortException | PasswordException | ConfirmPasswordException | EmailException
				| UserAlreadyExistException | EmailAlreadyExistException e) {

			System.out.println("Exception occured: " + e);
		}
		return flag == 0 ? true : false;
	}

}
