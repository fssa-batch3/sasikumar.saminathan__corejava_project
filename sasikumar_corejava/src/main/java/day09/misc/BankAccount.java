package day09.misc;

class Account{
	
	String name;
	String accountNo;
	double balance;
	
	public Account(String name, String accountNo,double balance) {
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}
}

public class BankAccount {
	public static void main(String[] args) {
		
		
		
		
		Account acc1  = new Account("sasi","1",1000.0);
		Account acc2  = new Account("sandeep","2",2000.0);
		Account acc3  = new Account("pranaw","3",3000.0);
	}
}
