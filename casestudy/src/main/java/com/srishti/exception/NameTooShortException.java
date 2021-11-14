package com.srishti.exception;

@SuppressWarnings("serial")
public class NameTooShortException extends Exception {

	@SuppressWarnings("unused")
	private String msg;

	public NameTooShortException() {
		this.msg = "Username should be atleast 3 letters long";
	}

	public NameTooShortException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NameTooShortException [" + msg + "]";
	}

}
