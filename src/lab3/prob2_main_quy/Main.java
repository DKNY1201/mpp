package lab3.prob2_main_quy;

import lab3.prob2_quy.*;

/**
 * Created by Bi on 6/28/17.
 */
public class Main {
    public static void main(String[] args) {
        Building building1 = new Building("1000 4th Street, Fairfield");
        building1.addApartment("b1_a1", 1000);
        building1.addApartment("b1_a2", 2000);
        building1.addApartment("b1_a3", 3000);
        Building building2 = new Building("805 N.Main Street, Fairfield");
        building2.addApartment("b2_a1", 1000);
        building2.addApartment("b2_a2", 2000);

        System.out.println(building1.generateProfit());
        System.out.println(building2.generateProfit());
    }
}
