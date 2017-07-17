package lab10.prob7.soln2;

import lab10.prob7.Employee;
import lab10.prob7.Main;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Bi on 7/16/17.
 */
public class UnitTestProb7Soln2 {
    List<Employee> emps = Arrays.asList(new Employee("Quy", "Tran", 120000),
                new Employee("Andy", "Mai", 110000),
                new Employee("Kim", "Long", 200000),
                new Employee("Lambda", "Jack", 80000),
                new Employee("Mint", "Zar", 120000));

    @Test
    public void unitTestSalaryGreaterThan100000() {
        assertTrue(Main.salaryGreaterThan100000(emps.get(0)));
        assertFalse(Main.salaryGreaterThan100000(emps.get(3)));
    }

    @Test
    public void unitTestLastNameAfterM() {
        assertTrue(Main.lastNameAfterM(emps.get(0)));
        assertFalse(Main.lastNameAfterM(emps.get(2)));
    }

    @Test
    public void unitTestFullName() {
        assertEquals("Quy Tran", Main.fullName(emps.get(0)));
        assertEquals("Kim Long", Main.fullName(emps.get(2)));
    }
}
