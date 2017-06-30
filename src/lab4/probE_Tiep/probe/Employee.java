package probe;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	public Employee(String name){
		this.name = name;
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account account){
		accounts.add(account);
	}
	
	public String getName(){
		return name;
	}
	
	public double computeUpdatedBalanceSum() {
		double sum = 0;
		for (Account account : accounts) {
			sum += account.computeUpdatedBalance();
		}
		return sum;
	}
}
