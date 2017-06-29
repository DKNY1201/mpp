package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String address;
	private double maintenanceCost;
	private List<Apartment> apartments;
	
	public Building(String address, double maintenanceCost, String aparmentNo, double rentAmount){
		this.address = address;
		this.maintenanceCost = maintenanceCost;
		apartments = new ArrayList<Apartment>();
		addApartment(aparmentNo, rentAmount);
	}
	
	public void addApartment(String aparmentNo, double rentAmount){
		apartments.add(new Apartment(aparmentNo, rentAmount, this));
	}

	public String getAddress() {
		return address;
	}
	
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	
	public double computeProfit(){
		double profit = -(maintenanceCost);
		for (Apartment apartment : apartments) {
			profit += apartment.getRent();
		}
		return profit;
	}
}
