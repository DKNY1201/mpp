package lab3.prob4_quy;

/**
 * Created by Bi on 6/28/17.
 */
public class House extends Property {
    double lotSize;

    House(double lotSize) {
        this.lotSize = lotSize;
    }


    @Override
    public double computeRent() {
        return this.lotSize * 0.1;
    }
}
