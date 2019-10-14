package com.wipro.bank.exception;

public class BankValidationException extends Exception {
	BankValidationException(String str)
	{
		super(str);
		
	}
	public String toString() {
		return "Invalid Data";
	}
}
