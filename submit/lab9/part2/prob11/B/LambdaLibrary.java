package lab9.part2.prob11.B;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Bi on 7/14/17.
 */
public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> SALARY_LASTNAME
            = (employeeList, salary, charToCompare) -> employeeList.stream()
            .filter(employee -> employee.getSalary() > salary)
            .filter(employee -> employee.getLastName().charAt(0) > charToCompare)
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .sorted()
            .collect(Collectors.joining(", "));
}
