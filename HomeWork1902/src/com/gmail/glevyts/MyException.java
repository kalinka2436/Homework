package com.gmail.glevyts;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Go away!!";
	}
}