package prob4;

public class Condo extends Property{
	private String address;
	private String city;
	private double rent;
	private double numFloors;
	
	Condo(String address, String city, double numFloors){
		this.rent = 400;
		this.numFloors = numFloors;
		this.address = address;
		this.city = city;
	}

	public double getRent() {
		return rent;
	}

	public double getNumFloors() {
		return numFloors;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCity(){
		return city;
	}

	@Override
	double compteTotalRent() {
		return rent*numFloors;
	}
	
	@Override
	boolean isLocateInCity(String city) {
		if (this.city.equals(city)) return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Condo address: " + address + ", " + city + " - Number of floors: " + numFloors;
	}
}
