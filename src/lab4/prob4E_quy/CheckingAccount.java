package lab4.prob4E_quy;

public class CheckingAccount extends Account {
	double balance;
	double monthlyFee;
	String acctId;
	
	public CheckingAccount(String acctId, double fee, double startBalance) {
		this.acctId = acctId;
		this.monthlyFee = fee;
		this.balance = startBalance;
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
		return getBalance() - monthlyFee;
	}

}
