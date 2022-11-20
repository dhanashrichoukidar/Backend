package oops;

public class EncapsulationExample1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setEmpId(121);
		
		e1.print();
	}
}

class Employee {
	private int empid;
	private String name;
	private String contact;
	
	public int getEmpId() {
		return empid;
	}
	
	public void setEmpId(int id) {
		empid = id;
	}
	
	
	// getter (GET THE VALUE)/setter (SET THE VALUE)
	
	public void print() {
		System.out.println("Id : " + empid);
		System.out.println("name : " + name);
		System.out.println("contact : " + contact);
	}
}
