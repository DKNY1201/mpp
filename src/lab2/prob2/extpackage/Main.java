package prob2.extpackage;
import java.time.LocalDate;

import prob2A.Student;
import prob2B.Order;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Tiep");
		student.getGradeReport().postGrade("A+");
		System.out.println(student.getGradeReport());
		
		Order order = new Order(LocalDate.now());
		order.addOrderLine("Macbook", 1000, 3);
		order.addOrderLine("Lenovo", 500, 10);
		System.out.println(order);
	}
}
