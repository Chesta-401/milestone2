package com.customer.model.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class DataAccessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DataAccessException(SQLException e) {
		System.out.println("SQL Exception");
		e.printStackTrace();
	}

	public DataAccessException(IOException e) {
		System.out.println("IO Exception");
		e.printStackTrace();

	}
}
