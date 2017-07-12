package test;

import java.util.function.Function;

/**
 * Created by Bi on 7/12/17.
 */
public class Test {
    public static void main(String[] args) {
        // (String x) -> x.toUpperCase()
        Function<String, String> function = (String x) -> x.toUpperCase();
        Function<String, String> function1 = String::toUpperCase;

        System.out.println(function.apply("tran van quy"));
        System.out.println(function1.apply("tran van quy"));

//        A. (Employee e) -> e.getName()
//        Function<Emmployee>
//        B. (Employee e,String s) -> e.setName(s)
//        C. (String s1,String s2) -> s1.compareTo(s2)
//        D. (Integer x,Integer y) -> Math.pow(x,y)
//        E. (Apple a) -> a.getWeight()
//        F. (String x) -> Integer.parseInt(x);
//        G. EmployeeNameComparator comp = new EmployeeNameComparator();
//        (Employee e1, Employee e2) -> comp.compare(e1,e2)

    }
}
