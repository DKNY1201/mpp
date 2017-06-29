package prob1tiep;

public class PersonWithJob {
	Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = person.getName().equals(p.person.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	public static void main(String[] args) {
		//Person p1 = new Person("Joe");
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);
		Person p3 = new Person("Joe");
		Person p4 = new Person("Joe");
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		System.out.println("p3.equals(p1)? " + p3.equals(p1));
		System.out.println("p1.equals(p3)? " + p1.equals(p3));
		System.out.println("p3.equals(p4)? " + p3.equals(p4));
		System.out.println("p4.equals(p3)? " + p4.equals(p3));
	}


}
