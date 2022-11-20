import java.util.Scanner;
class UnderAgeException extends RuntimeException {        //with runtime Exception be it customised or predefined you dont need to apply try catch or throws
	
	
	UnderAgeException(){
			super("You are under age");
		}
		UnderAgeException(String msg){
			super(msg);
		}
	}
	


public class ThrowCustomException {

	public static void main(String[] args) {
		
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scan.nextInt();	
		
			printEmployeeAge(age);
			
			
		scan.close();
	}

	

	public static void printEmployeeAge(int age) {
		if(age>=18 && age<=60) {
			System.out.println("Employee Age is : " + age);
		}
		else {
			throw new UnderAgeException("Invalid age for employee");
		}	
	}
	}
	
	