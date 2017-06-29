package prob4tiep;

public class House extends Property{
	private String address;
	private String city;
	private double rent;
	private double lotSize;
	
	House(String address, String city, double lotSize){
		this.rent = 0.1;
		this.lotSize = lotSize;
		this.address = address;
		this.city = city;
	}

	public double getRent() {
		return rent;
	}

	public double getLotSize() {
		return lotSize;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCity(){
		return city;
	}

	@Override
	double compteTotalRent() {
		return rent*lotSize;
	}

	@Override
	boolean isLocateInCity(String city) {
		if (this.city.equals(city)) return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "House address: " + address + ", " + city + " - Lot size: " + lotSize;
	}
}
