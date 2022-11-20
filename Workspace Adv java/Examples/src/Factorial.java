
import java.util.Scanner;

public class Factorial {
	public static void main (String arr[]) {
		Scanner sc = new Scanner(System.in);
		int i;
		int fact=1;
		System.out.println("Enter number");
		int n= sc.nextInt();
		
		
		for(i=1; i<=n; i++) {
			fact= fact*i;
			System.out.println(fact);
		}
		System.out.println("Factorial of number " + n + "is: " +fact);
	}

}
