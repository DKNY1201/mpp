package prob2;

import java.util.List;

public class Admin {
	private List<Building> buildings;
	
	public Admin(List<Building> buildings){
		this.buildings = buildings;
	}
	
	public double computeTotalProfit(){
		double profit = 0;
		for (Building building : buildings) {
			profit += building.computeProfit();
		}
		return profit;
	}
}
