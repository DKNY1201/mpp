package lab3.prob4_quy;

/**
 * Created by Bi on 6/28/17.
 */
public class Condo extends Property {
    int numFloors;

    Condo(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public double computeRent() {
        return this.numFloors * 400;
    }
}
