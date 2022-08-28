package ver1;

public class Account {
	//instance variable
	private double balance;
	
	//constructor
	public Account(double initBalance) {
		balance = initBalance;
	}
	//getter
	public double getBalance() {
		return balance;
	}

	//function
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}	
	}
	
	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
		}
	}
	
	@Override
	public String toString() {
		String msg = "balance=$" + balance;
		return msg;
	}
	//test
	public static void main(String[] args) {
		Account a1 = new Account(1000.0);
		System.out.println("Balance=$"+a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$"+a1.getBalance());
		
		a1.withdraw(200.0);
		System.out.println("Balance=$"+a1.getBalance());
		
		System.out.println(a1.toString());
		System.out.println(a1);
	}
}
