package com.bank.service;

import java.util.List;
import java.util.Scanner;

import com.bank.dao.BankAccountDAO;
import com.bank.dao.BankAccountDAOImpl;
import com.bank.dto.BankAccount;

public class BankAccountServiceImpl implements BankAccountService{

	BankAccountDAO bdao = new BankAccountDAOImpl();
	
	@Override
	public void addNewBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		bdao.addNewBankAccount(bankAccount);
	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		bdao.removeBankAccount(bankAccount);
	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		bdao.updateBankAccount(bankAccount);
	}

	@Override
	public List<BankAccount> showAllAccounts() {
		// TODO Auto-generated method stub
		return bdao.showAllAccounts();
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		return;  
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public boolean search(String ac_no) {
		// TODO Auto-generated method stub
		return false;
	}

}
