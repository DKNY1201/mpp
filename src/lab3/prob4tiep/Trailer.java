package prob4tiep;

public class Trailer extends Property{
	private String address;
	private double rent;
	
	Trailer(String address){
		this.rent = 500;
		this.address = address;
	}

	public double getRent() {
		return rent;
	}
	
	public String getAddress(){
		return address;
	}

	@Override
	double compteTotalRent() {
		return rent;
	}
}
