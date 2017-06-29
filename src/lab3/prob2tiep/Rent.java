package prob2tiep;

public class Rent {
	private double amount;
	private Apartment apartment;
	
	Rent(double amount, Apartment apartment){
		this.amount = amount;
		this.apartment = apartment;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public Apartment getApartment(){
		return apartment;
	}
	
}
