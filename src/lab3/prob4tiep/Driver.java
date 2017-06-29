package prob4tiep;

import java.util.List;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		House[] houses = {
				new House("900 N 10th ST",9000),
				new House("1000 W 8th ST",8000),
				new House("300 N 4th ST",10000)
		};
		Condo[] condos = {
				new Condo("20 Main ST",2),
				new Condo("40 Burlington ST",3),
				new Condo("100 Main ST",5)
		};
		Trailer[] trailers = {
				new Trailer("No 1 Center Park"),
				new Trailer("No 2 Center Park")
		};
		List<House> houseList = Arrays.asList(houses);
		List<Condo> condoList = Arrays.asList(condos);
		List<Trailer> trailerList = Arrays.asList(trailers);
		List<Property> propertyList = Admin.refactorPropertyList(houseList, condoList, trailerList);
		double totalRent = Admin.computeTotalRent(propertyList);
		System.out.println(totalRent);
	}
}
