
import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "A", 43534.4);
		Employee e2 = new Employee(11, "B", 456756.9);
		Employee e3 = new Employee(21, "C", 656783.56);
		Employee e4 = new Employee(31, "D", 65756.65);
		Employee e5 = new Employee(121, "E", 342334.34);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		Employee emp = null;
		double maxSalary = 0.0;
		for( Employee e : empList ) {
			if(e.getSalary() > maxSalary) {
				maxSalary = e.getSalary() ;
				emp = e;
			}
		}
		System.out.println("Employee having Max Salary : ");
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Salary : " + emp.getSalary());
	}

}