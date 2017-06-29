package prob4tiep;

import java.util.List;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		House[] houses = { new House("900 N 10th ST", "Fairfield", 9000), new House("1000 W 8th ST", "Fairfield", 8000),
				new House("300 N 4th ST", "Fairfield", 10000) };
		Condo[] condos = { new Condo("20 Main ST", "Fairfield", 2), new Condo("40 Burlington ST", "Fairfield", 3),
				new Condo("100 Main ST", "Fairfield", 5) };
		Trailer[] trailers = { new Trailer("No 1 Center Park", "New York"),
				new Trailer("No 2 Center Park", "New York") };
		List<House> houseList = Arrays.asList(houses);
		List<Condo> condoList = Arrays.asList(condos);
		List<Trailer> trailerList = Arrays.asList(trailers);
		List<Property> propertyList = Admin.refactorPropertyList(houseList, condoList, trailerList);
		double totalRent = Admin.computeTotalRent(propertyList);
		System.out.println("Your total rent is " + totalRent + "\n");

		Admin.listPropertyByCity(propertyList, "Fairfield");
		Admin.listPropertyByCity(propertyList, "New York");
	}
}
