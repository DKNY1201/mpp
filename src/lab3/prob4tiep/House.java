package prob4tiep;

public class House extends Property{
	private String address;
	private double rent;
	private double lotSize;
	
	House(String address, double lotSize){
		this.rent = 0.1;
		this.lotSize = lotSize;
		this.address = address;
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

	@Override
	double compteTotalRent() {
		return rent*lotSize;
	}
	
}
