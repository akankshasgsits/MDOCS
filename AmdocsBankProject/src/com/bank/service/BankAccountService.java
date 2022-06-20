package com.bank.service;

import java.util.List;

import com.bank.dto.BankAccount;

public interface BankAccountService {

	public abstract void addNewBankAccount(BankAccount bankAccount);
	public abstract void removeBankAccount(BankAccount bankAccount);
	public abstract void updateBankAccount(BankAccount bankAccount);
	public abstract List<BankAccount> showAllAccounts();
	public abstract void deposit() ;
	public abstract void withdrawal();
	public abstract boolean search(String ac_no);
}
