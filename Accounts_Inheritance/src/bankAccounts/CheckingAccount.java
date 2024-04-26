package bankAccounts;

public class CheckingAccount extends BankAccount{
	
	private int count;

	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		this.count = 0;
	}

	public void writeCheck(double amount) throws Exception {
		
		if(amount > balance) throw new Exception(" Enter less than" + balance);
		if(amount < 500) throw new Exception("Invalid amount");
		
		withdraw(amount);
		count++;
	}

}
