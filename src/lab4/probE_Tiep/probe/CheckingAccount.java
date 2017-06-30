package probe;

public class CheckingAccount extends Account{
	private double balance;
	private double monthlyFee;
	private String accId;
	
	public CheckingAccount(String accId, double fee, double balance) {
		this.accId = accId;
		this.monthlyFee = fee;
		this.balance = balance;
	}

	public double getMonthlyFee() {
		return monthlyFee;
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
		return balance - monthlyFee;
	}

}
