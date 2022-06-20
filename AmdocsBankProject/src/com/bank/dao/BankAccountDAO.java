package com.bank.dao;
import java.util.List;

//BANK DATA ACCESS OBJECT is used to access the data and is used for buisness logic
import com.bank.dto.BankAccount;

public interface BankAccountDAO {
	
	public abstract void addNewBankAccount(BankAccount bankAccount);
	public abstract void removeBankAccount(BankAccount bankAccount);
	public abstract void updateBankAccount(BankAccount bankAccount);
	public abstract List<BankAccount> showAllAccounts();
	public abstract long displayBalance(BankAccount bankAccount);
	public abstract void deposit(BankAccount bankaccount);
	public abstract void withdrawal(BankAccount bankaccount);
	public boolean search(String accno);
	
	
	
}
