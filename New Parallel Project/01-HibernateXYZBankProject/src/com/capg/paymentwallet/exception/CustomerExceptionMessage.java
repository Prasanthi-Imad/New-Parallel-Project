package com.capg.paymentwallet.exception;

public class CustomerExceptionMessage extends CustomerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String Error_in_firstName ="First Name should be more than 4 characters";
	public static final String Error_in_lastName ="Last Name should be more than 4 characters";
	public static final String Error_in_Email = "Email should be valid one";
	public static final String Error_in_PAN = "Pan number should be valid one";
	public static final String Error_in_PhoneNumber = "phone number should be valid one";
	public static final String Error_in_balance = "Balance should be greater than 500";
	public static final String Error_in_Address = "Address should not be null";

	
	

}
