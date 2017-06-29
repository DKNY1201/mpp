package lab3.prob2_quy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bi on 6/28/17.
 */
public class Building {
    String address;
    List<Apartment> listApartment;

    public Building(String address) {
        this.address = address;
        listApartment = new ArrayList<Apartment>();
//        this.listApartment.add(new Apartment(apartmentID, this));
    }

    public void addApartment(String apartmentID, double area) {
        Apartment apartment = new Apartment(apartmentID, area, this);
        listApartment.add(apartment);
    }

    public double generateProfit() {
        return generateRent() - generateMaintainCost();
    }

    double generateRent() {
        double profit = 0;
        for (Apartment apartment: listApartment) {
            profit += apartment.calcRent();
        }
        return profit;
    }

    double generateMaintainCost() {
        double maintainCost = 0;
        for (Apartment apartment: listApartment) {
            maintainCost += apartment.calcMaintainCost();
        }
        return maintainCost;
    }
}
