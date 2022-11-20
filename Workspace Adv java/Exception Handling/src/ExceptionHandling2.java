
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("enter 1st number : ");
			int num1 = scan.nextInt();
			System.out.println("enter 2nd number : ");
			int num2 = scan.nextInt();
			
			System.out.println("Add : " + (num1 + num2));
			System.out.println("Mul : " + (num1 * num2));
			System.out.println("Sub : " + (num1 - num2));
			System.out.println("Div : " + (num1 / num2));
			
		} 
		catch(InputMismatchException ex) {
			System.out.println("You provided a wrong values..");
		}
		catch(ArithmeticException ex) {
			System.out.println("Cannot Divide by Zero..");
		}
		
		
		finally {
			scan.close();
		}
		
		
		
		
		
	}

}