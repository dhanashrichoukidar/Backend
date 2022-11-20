import java.util.Scanner;
public class ScannerUserInput
{
	public static void main(String args[])
	{
		System.out.println("Scanner Implementation Started....");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.next();

		System.out.println("Enter 1st Number (Decimal) : ");
		double num1 = scan.nextDouble();

		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();

		System.out.println("Sum : " + (num1 + num2));
	}
}