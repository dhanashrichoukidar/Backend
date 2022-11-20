package Inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		JavaDeveloper jd = new JavaDeveloper();
		
		
		System.out.println(jd.toString());
		
		jd.name = "Abc";
		jd.id = 121;
		jd.task = "Complete Java Code";
		jd.display();
		
		
		Employee emp = new JavaDeveloper(); // Polymorphic Object 
		
		
	}
}


class Person extends Object {
	String name;
}

class Employee extends Person {
	int id;
}

class JavaDeveloper extends Employee {
	String task;
	
	
	public void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Task : " + task);
	}
}