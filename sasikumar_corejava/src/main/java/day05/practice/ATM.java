package day05.practice;

//Change the below class to have setters and Getters and Constructors
class Account {
	String accNo;
	double balance;

	public Account(String accNo, double balance) {
		// TODO Auto-generated constructor stub
		this.accNo = accNo;
		this.balance = balance;
	}

}

//Create an implementation of the below Interface
public interface ATM {
	
	boolean deposit(Account account, double amount);

	boolean withdraw(Account account, double amount) throws Exception;

	double getBalance();

	public static void main(String[] args) {

		Account acc1 = new Account("01", 500);
		ATM atm1 = new AxisAtm();
		atm1.deposit(acc1, 100);
		System.out.println(atm1.getBalance());

		try {
			// try to withdraw if it's low balance it will throw a exception
			atm1.withdraw(acc1, 20);
			System.out.println(atm1.getBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

//// This is AxisAtm it Needs minimum 5,000 balance and withdrawal charge 5rs
class AxisAtm implements ATM {
	double balance;

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		account.balance += amount;
		this.balance = account.balance;
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if (account.balance < 5000) {
			throw new Exception("Account balance is low");
		} else {
			account.balance -= amount + 5;
			this.balance = account.balance;
			return true;
		}
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
}

// This is iciciAtm it Needs minimum 10,000 balance and withdrawal charge 10rs
class iciciAtm implements ATM {
	double balance;

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		account.balance += amount;
		this.balance = account.balance;
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if (account.balance < 10000) {
			throw new Exception("Account balance is low");
		} else {
			account.balance -= amount + 10;
			this.balance = account.balance;
			return true;
		}
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
}
