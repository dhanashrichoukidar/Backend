package Keywords;

public class ConstructorDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.printDetails();
		
		Employee emp1 = new Employee(12, "Abc", "Pune", 45645.4);
		emp1.printDetails();
	}
}

class Employee {
	int id;
	String name;
	String city;
	double salary;
	
	public Employee() { // no parameterize constructor
		name = "NA";
		city = "NA";
		salary = 0.1;		
	}
	
	protected Employee(int id, String name, String city, double salary) { // parameterized constructor
		this.id = id;
		this.name = name;
		this.city= city;
		this.salary = salary;
	}
	
	Employee(int id, String name, String city) { // parameterized constructor
		this.id = id;
		this.name = name;
		this.city= city;
	}
	
	public void printDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
		System.out.println("Salary : " + salary);
	}
	
}