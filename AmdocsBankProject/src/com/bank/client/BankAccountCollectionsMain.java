package com.bank.client;

import java.util.List;

import com.bank.dto.BankAccount;
import com.bank.service.BankAccountService;
import com.bank.service.BankAccountServiceImpl;

public class BankAccountCollectionsMain {
public static void main(String[] args) {
	BankAccountService bservice = new BankAccountServiceImpl();
	
	bservice.addNewBankAccount(new BankAccount("101CA","Akanksha","Savings", 10000));
	bservice.addNewBankAccount(new BankAccount("102CA","Kartik","Savings", 20000));
	bservice.addNewBankAccount(new BankAccount("103CA","Ankit","Savings", 20000));
	bservice.addNewBankAccount(new BankAccount("104CA","Dolly","Savings", 10000));
	bservice.addNewBankAccount(new BankAccount("105CA","Arnav","Savings", 10000));
	
	List<BankAccount> actList = bservice.showAllAccounts();
	
	for(BankAccount act : actList)
	{
		System.out.println(act.getAccno()+" "+act.getName()+" "+act.getBalance());
	}
	BankAccount temp = new BankAccount("101CA","Aka","Savings",10000);
	bservice.updateBankAccount(temp);
	
	System.out.println("Updated list");
	actList = bservice.showAllAccounts();
	
	for(BankAccount act : actList)
	{
		System.out.println(act.getAccno()+" "+act.getName()+" "+act.getBalance());
	}
	BankAccount temp1 = new BankAccount("101CA","Aka","Savings",10000);
	bservice.removeBankAccount(temp1);
	actList = bservice.showAllAccounts();
	System.out.println("list after removingthe record");
	for(BankAccount act : actList)
	{
		System.out.println(act.getAccno()+" "+act.getName()+" "+act.getBalance());
	}
}

}
