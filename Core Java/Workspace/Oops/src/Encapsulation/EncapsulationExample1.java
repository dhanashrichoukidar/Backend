package Encapsulation;

public class EncapsulationExample1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpid(121);
		e1.setName("ABc");
		e1.setContact("99887766");
		
		printEmployeeDetails(e1); // Data Transfer Object (DTO)
	}
	
	public static void printEmployeeDetails(Employee emp) {
		System.out.println("EMploYee Id : " + emp.getEmpid());
		System.out.println("EMploYee Name : " + emp.getName());
		System.out.println("EMploYee Contact : " + emp.getContact());
	}
	
}

class Employee {
	private int id;
	private String name;
	private String contact;
	
	public void setEmpid(int i) {
		id = i;
	}
	
	public int getEmpid() {
		return id;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public String getName() {
		return name;
	}
	
	public void setContact (String ct) {
		if(ct.length()!= 10 ) {
			System.err.println("Invalid Contact.....");
		}
		contact = ct;
	}
	
	public String getContact() {
		 return contact;
	}
	
}