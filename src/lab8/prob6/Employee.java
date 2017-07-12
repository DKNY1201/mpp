package lab8.prob6;

public class Employee {
	String name;
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		return e.name.equals(name) && e.salary == salary;
		
	}
}

