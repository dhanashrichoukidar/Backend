
import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		int arr[] = {45,4,5,0,34,1,6,0};
		
		// Get the indexes from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Index : ");
		int indx1 = scan.nextInt();
		
		System.out.println("Enter 2nd Index : ");
		int indx2 = scan.nextInt();
		
		// get the values present on that index
		int value1 = 0;
		int value2 = 0;
		try {
			value1 = arr[indx1];
			value2 = arr[indx2];
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid index Provided, hence going with the default values...");
			value1 = 1;
			value2 = 1;
		}
		// perform the add,sub, mul, div operation on those values
		System.out.println("Add : " + (value1 + value2));
		System.out.println("Sub : " + (value1 - value2));
		System.out.println("Div : " + (value1 / value2));
		System.out.println("Mul : " + (value1 * value2));
		
		scan.close();
	
	}

}