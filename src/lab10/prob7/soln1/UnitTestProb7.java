package lab10.prob7.soln1;

import lab10.prob7.Employee;
import lab10.prob7.Main;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Stream;


/**
 * Created by Bi on 7/16/17.
 */
public class UnitTestProb7 {
    @Test
    public void unitTestPrintEmps() {
        Stream<Employee> emps = Arrays.asList(new Employee("Quy", "Tran", 120000),
                new Employee("Andy", "Mai", 110000),
                new Employee("Kim", "Long", 200000),
                new Employee("Lambda", "Jack", 80000),
                new Employee("Mint", "Zar", 120000)).stream();

        String expectedString = "Mint Zar, Quy Tran";

        assertEquals(expectedString, Main.asString(emps));
    }
}
