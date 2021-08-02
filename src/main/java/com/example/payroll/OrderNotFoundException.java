package com.example.payroll;

public class OrderNotFoundException extends RuntimeException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	OrderNotFoundException(Long id){
		super("Could not find order " + id);
	}
}
