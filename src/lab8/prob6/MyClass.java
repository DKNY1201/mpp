package lab8.prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Bi on 7/12/17.
 */
public class MyClass {
    public static void main(String[] args) {
        // (String x) -> x.toUpperCase()
        class MyFunction implements Function<String, String> {

            /**
             * Applies this function to the given argument.
             *
             * @param string the function argument
             * @return the function result
             */
            @Override
            public String apply(String string) {
                return string.toUpperCase();
            }
        }
        Function<String, String> function = (String x) -> x.toUpperCase();
        Function<String, String> function1 = String::toUpperCase;

        System.out.println(function.apply("tran van quy"));
        System.out.println(function1.apply("tran van quy"));

        MyFunction myFunction = new MyFunction();
        System.out.println(myFunction.apply("cu bi bi"));

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("kaka");

        Employee emp1 = new Employee("Quy", 200000);
        Employee emp2 = new Employee("Bi", 300000);

//        A. (Employee e) -> e.getName()
        Function<Employee, String> function2 = (Employee e) -> e.getName();
        Function<Employee, String> function3 = Employee::getName;
        System.out.println(function2.apply(emp1));
        System.out.println(function3.apply(emp2));

//        B. (Employee e,String s) -> e.setName(s)
        BiConsumer<Employee, String> biConsumer = (e,s) -> e.setName(s);
        BiConsumer<Employee, String> biConsumer1 = Employee::setName;

        biConsumer.accept(emp1, "Kim Long");
        biConsumer1.accept(emp2, "Bi Tran");
        System.out.println(function2.apply(emp1));
        System.out.println(function2.apply(emp2));

//        C. (String s1,String s2) -> s1.compareTo(s2)
        BiFunction<String, String, Integer> compare = (String s1,String s2) -> s1.compareTo(s2);
        BiFunction<String, String, Integer> compare1 = String::compareTo;
        System.out.println(compare.apply("abc", "abd"));
        System.out.println(compare1.apply("abc", "abd"));

//        D. (Integer x,Integer y) -> Math.pow(x,y)
        BiFunction<Integer, Integer, Double> pow = (Integer x,Integer y) -> Math.pow(x,y);
        BiFunction<Integer, Integer, Double> pow1 = Math::pow;
        System.out.println(pow.apply(2,4));
        System.out.println(pow1.apply(2,4));

//        E. (Apple a) -> a.getWeight()
        Apple apple = new Apple(12.5);
        Function<Apple, Double> appleWeight = (Apple a) -> a.getWeight();
        Function<Apple, Double> appleWeight1 = Apple::getWeight;
        System.out.println(appleWeight.apply(apple));
        System.out.println(appleWeight1.apply(apple));

//        F. (String x) -> Integer.parseInt(x)
        Function<String, Integer> toString = (String x) -> Integer.parseInt(x);
        Function<String, Integer> toString1 = Integer::parseInt;
        System.out.println(toString.apply("10"));
        System.out.println(toString1.apply("10"));

//        G. EmployeeNameComparator comp = new EmployeeNameComparator();
//        (Employee e1, Employee e2) -> comp.compare(e1,e2)
        EmployeeNameComparator comp = new EmployeeNameComparator();
        BiFunction<Employee, Employee, Integer> compEmp = (Employee e1, Employee e2) -> comp.compare(e1,e2);
        BiFunction<Employee, Employee, Integer> compEmp1 = comp::compare;
        System.out.println(compEmp.apply(emp1, emp2));
        System.out.println(compEmp1.apply(emp1, emp2));
    }
}
