
public class EncapsulationExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee e1 = new Employee();
		
		e1.setEmpId(121);
	
       
		
		System.out.println("Employee Id : " + e1.getEmpId());
		System.out.println("Employee Name : " + e1.getName());
		System.out.println("Employee Contact : " + e1.getContact());

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
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String Nm) {
		name = Nm;
	}
	
	
	
	public String getContact() {
		return contact ;
	}

	
	public void setContact(String Ct) {
		if(Ct.length()!= 10) {
			System.err.println("Invalid Contact");
		}
		contact = Ct;
	}


	// getter (GET THE VALUE)/setter (SET THE VALUE)
	class Erase {
	
	public void print() {
		System.out.println("Id : " + empid);
		System.out.println("name : " + name);
		System.out.println("contact : " + contact);
	}
	}
}
	


