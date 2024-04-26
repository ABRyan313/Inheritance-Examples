package bankAccounts;

public class Main {

	public static void main(String[] args) {
		
		SavingsAccount savings = new SavingsAccount(100000, 0.05);
		savings.addInterest();
		System.out.println("Total balance" +savings.getBalance());
		
		CheckingAccount check = new CheckingAccount(50000);
		try {
			check.writeCheck(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Current balance" +check.getBalance());

	}

}
