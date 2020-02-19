
public class Account {
			private String acnm;
			private String acid;
			int amount;
			public Account(String acnm, String acid, int amount) {
				this.acnm = acnm;
				this.acid = acid;
				this.amount = amount;
			}
			public void deposit(int depoamount)
			{
				amount=amount+depoamount;
			}
			public void withdraw(int withamount)
			{
				amount =amount-withamount;
			}
			public void show ()
			{
				System.out.println("Account name :"+acnm);
				System.out.println("Account ID :"+acid);
				System.out.println("Amount  ="+amount+ " Taka");
			}
			

}
