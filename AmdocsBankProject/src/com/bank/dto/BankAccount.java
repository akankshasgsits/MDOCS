package com.bank.dto;
//BANK DATA TRANSFER OBJECT is created to encapsulate and aggregate data for transfer.
import java.util.Objects;

public class BankAccount {

	   
	        private String accno;  
	        private String name;  
	        private String acc_type;  
	        private long balance;  
	        
	        
	        public BankAccount(String accno, String name, String acc_type, long balance) {
				super();
				this.accno = accno;
				this.name = name;
				this.acc_type = acc_type;
				this.balance = balance;
			}

			public String getAccno() {
				return accno;
			}

			public void setAccno(String accno) {
				this.accno = accno;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAcc_type() {
				return acc_type;
			}

			public void setAcc_type(String acc_type) {
				this.acc_type = acc_type;
			}

			public long getBalance() {
				return balance;
			}

			public void setBalance(long balance) {
				this.balance = balance;
			}
			
			
			@Override
			public int hashCode() {
				return Objects.hash(accno);
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				BankAccount other = (BankAccount) obj;
				return Objects.equals(accno, other.accno);
			}

			


	
}
