package probe;

public class SavingsAccount extends Account{
	private double balance;
	private double interestRate;
	private String accId;
	
	public SavingsAccount(String accId, double interestRate, double startBalance) {
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public String getAccId() {
		return accId;
	}
	
	@Override
	double getBalance() {
		return balance;
	}

	@Override
	String getAccountID() {
		return accId;
	}

	@Override
	double computeUpdatedBalance() {
		return balance + (interestRate * balance);
	}
}
