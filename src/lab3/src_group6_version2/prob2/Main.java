package prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Building b1 = new Building("900 N 10th ST", 100, "001", 500);
		b1.addApartment("002", 600);
		b1.addApartment("003", 800);
		b1.addApartment("004", 1000);
		Building b2 = new Building("1000 N 10th ST", 150, "001", 600);
		b2.addApartment("002", 700);
		b2.addApartment("003", 900);
		b2.addApartment("004", 1200);
		
		List<Building> buildings = new ArrayList<Building>();
		buildings.add(b1);
		buildings.add(b2);
		Admin admin = new Admin(buildings);

		System.out.println("Total profit per month is: " + admin.computeTotalProfit());
	}
}
