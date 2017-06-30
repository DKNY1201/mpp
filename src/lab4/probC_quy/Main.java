package lab4.probC_quy;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Bi on 6/29/17.
 */
public class Main {
    public static void main(String[] args) {
        Hourly h1 = new Hourly("h001", 15, 40);
        Hourly h2 = new Hourly("h002", 20, 42);
        Hourly h3 = new Hourly("h003", 25, 50);

        Salaried s1 = new Salaried("s001", 5000);
        Salaried s2 = new Salaried("s001", 6000);
        Salaried s3 = new Salaried("s001", 7000);

        Commissioned c1 = new Commissioned("c001", 0.1, 2000);
        c1.addOrder("OrderC1001", new GregorianCalendar(2017,6,1).getTime(), 1000);
        c1.addOrder("OrderC1002", new GregorianCalendar(2017,6,12).getTime(), 1200);
        c1.addOrder("OrderC1003", new GregorianCalendar(2017,5,1).getTime(), 3000);
        Commissioned c2 = new Commissioned("c002", 0.1, 2500);
        c2.addOrder("OrderC2001", new GregorianCalendar(2016,7,1).getTime(), 1500);
        c2.addOrder("OrderC2002", new GregorianCalendar(2016,6,12).getTime(), 1700);
        c2.addOrder("OrderC2003", new GregorianCalendar(2016,5,1).getTime(), 3500);
        Commissioned c3 = new Commissioned("c003", 0.1, 3000);
        c3.addOrder("OrderC3001", new GregorianCalendar(2015,5,1).getTime(), 7000);
        c3.addOrder("OrderC3002", new GregorianCalendar(2015,5,12).getTime(), 1000);
        c3.addOrder("OrderC3003", new GregorianCalendar(2015,5,1).getTime(), 2000);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(h1);
        employees.add(h2);
        employees.add(h3);

        employees.add(s1);
        employees.add(s2);
        employees.add(s3);

        employees.add(c1);
        employees.add(c2);
        employees.add(c3);

        for (Employee e: employees) {
            e.print(5, 2015);
        }

    }
}
