package lab9.part2.prob12;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Bi on 7/14/17.
 */
public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, List<Employee>> SALARY_LASTNAME
            = (employees, salary, charToCompare)
            -> employees.stream()
            .filter(employee -> employee.getSalary() > salary)
            .filter(employee -> employee.getLastName().charAt(0) > charToCompare)
            .collect(Collectors.toList());

    public static final TriFunction<List<Employee>, Integer, Character, List<String>> SALARY_FIRSTNAME =
            (employees, salary, charToCompare)
                    -> employees.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .filter(employee -> employee.getFirstName().charAt(0) < charToCompare)
                    .map(employee -> employee.getFirstName().toUpperCase() + " " + employee.getLastName().toUpperCase())
                    .sorted()
                    .collect(Collectors.toList());
}
