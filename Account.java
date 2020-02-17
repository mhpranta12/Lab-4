package com.aiub.lab4;

public class Account {
			private String acnm;
			private String acid;
			private int balance;
			public Account() {
				super();
			}
			public Account(String acnm, String acid, int balance) {
				super();
				this.acnm = acnm;
				this.acid = acid;
				this.balance = balance;
			}
			public void deposit(int amount)
			{
				balance =balance+amount;
			}
			public void withdraw(int amount)
			{
				int xbalance=balance-amount;
			}
			public void show()
			{
				System.out.println("The remainning amount is :"+balance);
				System.out.println("The account name is :"+acnm);
				System.out.println("The account id is :"+acid);
			}
}
