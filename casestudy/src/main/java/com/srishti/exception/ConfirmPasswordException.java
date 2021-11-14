package com.srishti.exception;

public class ConfirmPasswordException extends Exception {
	private String msg;

	public ConfirmPasswordException() {
		this.msg = "Password and confirm password are different.";
	}

	public ConfirmPasswordException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ConfirmPasswordException [" + msg + "]";
	}
	

}
