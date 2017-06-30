package lab4.prob4E_quy;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double balanceSum = 0;
		
		for (Employee e: list) {
			balanceSum += e.computeUpdatedBalanceSum();
		}
		
		return balanceSum;
	}
}
