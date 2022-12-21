package com.capg.exception;

public class CustomerNotFoundException extends RuntimeException{
	private String message;
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(String message) {
		super();
		this.message=message;
		
	}
	public CustomerNotFoundException() {

}
}




