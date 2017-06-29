package prob2tiep;

public class Apartment{
	private String apartmentNo;
	private Rent rent;
	private Building building;
	
	Apartment(String aparmentNo, double amount, Building building){
		this.apartmentNo = aparmentNo;
		rent = new Rent(amount,this);
	}
	
	public String getApartmentNo() {
		return apartmentNo;
	}

	public Rent getRent() {
		return rent;
	}
	
	public Building getBuilding() {
		return building;
	}
}
