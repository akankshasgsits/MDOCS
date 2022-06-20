package com.bank.exceptions;

public class AccountNotFoundException extends Exception {

	private String accountNo;

	public AccountNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccountNotFoundException [accountNo=" + accountNo + "]";
	}
	
	
}
