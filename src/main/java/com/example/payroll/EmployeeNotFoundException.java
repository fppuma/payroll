package com.example.payroll;

public class EmployeeNotFoundException extends RuntimeException {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
