package prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {

	public static List<Property> refactorPropertyList(List<House> houses, List<Condo> condos, List<Trailer> trailers) {
		List<Property> list = new ArrayList<Property>();
		for (Property house : houses) {
			list.add(house);
		}
		for (Property condo : condos) {
			list.add(condo);
		}
		for (Property trailer : trailers) {
			list.add(trailer);
		}
		return list;
	}

	public static double computeTotalRent(List<Property> properties) {
		double sum = 0;
		for (Property property : properties) {
			sum += property.compteTotalRent();
		}
		return sum;
	}

	public static void listPropertyByCity(List<Property> properties, String city) {
		StringBuilder sb = new StringBuilder("Your property list in " + city + ":\n");
		for (Property property : properties) {
			if (property.isLocateInCity(city)) {
				sb.append(property);
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
