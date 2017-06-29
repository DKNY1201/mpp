package lab3.prob4_quy;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property property : properties) {
			totalRent += property.computeRent();
		}
		return totalRent;
	}
}
