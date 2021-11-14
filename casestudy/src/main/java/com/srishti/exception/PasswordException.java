package com.srishti.exception;

@SuppressWarnings("serial")
public class PasswordException extends Exception {

	@SuppressWarnings("unused")
	private String msg;

	public PasswordException() {
		this.msg = "Password is invalid.";
	}

	public PasswordException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PasswordException [" + msg + "]";
	}
	

}
