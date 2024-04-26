package bankAccounts;

public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingsAccount(double initialBalance, double interestRate) {
		super(initialBalance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double interest = balance * interestRate;
		 try {
			deposite(interest);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	

	
	

}
