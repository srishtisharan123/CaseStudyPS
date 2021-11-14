package com.srishti.exception;

public class UserAlreadyExistException extends Exception {
private String msg;
	
	public UserAlreadyExistException() {
		this.msg="Sorry... this username already exists";
	}

	public UserAlreadyExistException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "UserAlreadyExistException [" + msg + "]";
	}
	

}
