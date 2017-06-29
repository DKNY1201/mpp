package prob4tiep;

public class Trailer extends Property{
	private String address;
	private String city;
	private double rent;
	
	Trailer(String address, String city){
		this.rent = 500;
		this.address = address;
		this.city = city;
	}

	public double getRent() {
		return rent;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCity(){
		return city;
	}

	@Override
	double compteTotalRent() {
		return rent;
	}
	
	@Override
	boolean isLocateInCity(String city) {
		if (this.city.equals(city)) return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Trailer address: " + address + ", " + city;
	}
}
