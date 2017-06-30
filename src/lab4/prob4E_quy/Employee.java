package lab4.prob4E_quy;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	String name;
	List<Account> accountList;

	public Employee(String name) {
		this.name = name;
		accountList = new ArrayList<Account>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addAccount(Account acct) {
		accountList.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		double balanceSum = 0;
		
		for (Account acc: accountList) {
			balanceSum += acc.computeUpdatedBalance(); 
		}
		
		return balanceSum;
	}
}
