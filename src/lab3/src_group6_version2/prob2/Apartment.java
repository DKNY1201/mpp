package prob2;

public class Apartment{
	private String apartmentNo;
	private double rent;
	private Building building;
	
	Apartment(String aparmentNo, double rent, Building building){
		this.apartmentNo = aparmentNo;
		this.rent = rent;
	}
	
	public String getApartmentNo() {
		return apartmentNo;
	}

	public double getRent() {
		return rent;
	}
	
	public Building getBuilding() {
		return building;
	}
}
