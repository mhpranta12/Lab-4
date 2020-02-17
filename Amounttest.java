package com.aiub.lab4;

public class Amounttest {

	public static void main(String[] args) {
		Account x=new Account("Pranta","18-3745904-84855",2000);
		Account z=new Account();
		z.deposit(200);
		Account y=new Account();
		x.show();
	}

}
