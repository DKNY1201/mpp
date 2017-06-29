package lab3.prob2_quy;

/**
 * Created by Bi on 6/28/17.
 */
public class Apartment {
    String apartmentID;
    double area;
    Building building;

    Apartment(String apartmentID, double area, Building building) {
        this.apartmentID = apartmentID;
        this.building = building;
        this.area = area;
    }

    double calcRent() {
        return this.area * 0.5;
    }

    double calcMaintainCost() {
        return this.area * 0.1;
    }
}
