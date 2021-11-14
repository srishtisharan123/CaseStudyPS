package com.srishti.beans;

public class Customer {

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", cPassword=" + cPassword + ", email="
				+ email + ", gender=" + gender + "]";
	}

	private String username;
	private String password;
	private String cPassword;
	private String email;
	private String gender;

	public Customer() {
	}

	public Customer(String username, String password, String cPassword, String email, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.cPassword = cPassword;
		this.email = email;
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
