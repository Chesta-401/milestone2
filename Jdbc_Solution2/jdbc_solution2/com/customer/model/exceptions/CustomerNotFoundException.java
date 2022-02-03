package com.customer.model.exceptions;

public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 685025442025149581L;

	public CustomerNotFoundException(String msg) {
		super(msg);
	}

}
