package com.srishti.exception;

@SuppressWarnings("serial")
public class EmailException extends Exception {
	@SuppressWarnings("unused")
	private String msg;

	public EmailException() {
		this.msg = "Email is invalid";
	}

	public EmailException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "EmailException [" + msg + "]";
	}
	

}
