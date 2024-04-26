package bankAccounts;

public class BankAccount {
	
	protected double balance;

	public BankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}
	
	
	public void deposite(double amount) throws Exception {
		if(amount < 5000) throw new Exception(" Vul hoise");
			balance += amount;
	}
	
	
	public void withdraw(double amount) throws Exception {
		if(amount == 0 && amount > balance) throw new Exception(" Please try again! Least amount = 5000");
			balance -= amount;
	}


	public double getBalance() {
		return balance;
	}


}
