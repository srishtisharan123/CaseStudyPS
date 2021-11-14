package com.srishti.exception;

public class EmailAlreadyExistException extends Exception {
	private String msg;

	public EmailAlreadyExistException() {
		this.msg="Sorry... this email already exists";
	}

	public EmailAlreadyExistException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "EmailAlreadyExistException [" + msg + "]";
	}

}
