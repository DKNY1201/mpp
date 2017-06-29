package prob4tiep;

public class Condo extends Property{
	private String address;
	private double rent;
	private double numFloors;
	
	Condo(String address, double numFloors){
		this.rent = 400;
		this.numFloors = numFloors;
		this.address = address;
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

	@Override
	double compteTotalRent() {
		return rent*numFloors;
	}
}
