package prob1;

public class PersonWithJob {
	Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		this.person = new Person(n);
		this.salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.person.equals(p.person) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		PersonWithJob p3 = new PersonWithJob("Joe", 30000);
		Person p4 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));

		System.out.println("p1.equals(p3)? " + p1.equals(p3));
		System.out.println("p3.equals(p1)? " + p3.equals(p1));

		System.out.println("p2.equals(p4)? " + p2.equals(p4));
		System.out.println("p4.equals(p2)? " + p4.equals(p2));
	}


}
