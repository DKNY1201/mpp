package lab4.prob4E_quy;

public class SavingsAccount extends Account {
	double balance;
	double interestRate;
	String acctId;
	
	public SavingsAccount(String acctId, double interestRate, double balance) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.acctId = acctId;
	}

	@Override
	public String getAccountID() {
		return this.acctId;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return getBalance() + (interestRate * getBalance());
	}
	
}
