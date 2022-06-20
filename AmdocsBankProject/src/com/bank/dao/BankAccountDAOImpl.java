package com.bank.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.bank.dto.BankAccount;
import com.bank.exceptions.AccountNotFoundException;

public class BankAccountDAOImpl implements BankAccountDAO {
	 

	List<BankAccount> accountList = new LinkedList<BankAccount>();
	@Override
	public void addNewBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		accountList.add(bankAccount);
	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		/*before deleting bankaccount object from list
		first we need to check if it exists 
		otherwise we need to raise an exception*/
		if(!accountList.contains(bankAccount))
		{
			try 
			{
					throw new AccountNotFoundException(bankAccount.getAccno());
			}
			catch(AccountNotFoundException e)
			{
			e.printStackTrace();
			}
		}
		accountList.remove(bankAccount);
}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		if(!accountList.contains(bankAccount))
		{
			try 
			{
					throw new AccountNotFoundException(bankAccount.getAccno());
			}
			catch(AccountNotFoundException e)
			{
			e.printStackTrace();
			}
		}
		int index = accountList.indexOf(bankAccount);
		accountList.set(index, bankAccount);
		
	}

	@Override
	public List<BankAccount> showAllAccounts() {
		// TODO Auto-generated method stub
		return accountList;
	}

	@Override
	public void deposit(BankAccount bankaccount) {
		// TODO Auto-generated method stub
		if(!accountList.contains(bankaccount))
		{
			try 
			{
					throw new AccountNotFoundException(bankaccount.getAccno());
			}
			catch(AccountNotFoundException e)
			{
			e.printStackTrace();
			}
		}
		long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        Scanner sc = new Scanner(System.in);
        amt = sc.nextLong();  
        
	}

	@Override
	public void withdrawal(BankAccount bankaccount) {
		// TODO Auto-generated method stub
		if(!accountList.contains(bankaccount))
		{
			try 
			{
					throw new AccountNotFoundException(bankaccount.getAccno());
			}
			catch(AccountNotFoundException e)
			{
			e.printStackTrace();
			}
		}
		
		long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        Scanner sc = new Scanner(System.in);
        amt = sc.nextLong();  
        
		
	}
	public boolean search(String ac_no) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long displayBalance(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
