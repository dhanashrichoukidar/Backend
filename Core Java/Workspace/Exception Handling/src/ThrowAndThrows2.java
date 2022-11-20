
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThrowAndThrows2 {
	public static void main(String[] args)  {
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		
	
			printEmployeeAge(age);
		
		scan.close();
		}
	
		
		
	/*	try {
			readFileData("c:\\test.txt");
		} catch (FileNotFoundException | ArithmeticException | IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		

		
	
	public static void printEmployeeAge(int age){
		if(age>=18 && age<=60) {
			System.out.println("Employee Age is : " + age);
		}
	
		else {
		
			throw new IllegalArgumentException("Invalid age provided...");
		}
		System.out.println("normal flow");
			}
		
	
	

	
public static void readFileData(String filePath) throws FileNotFoundException, ArithmeticException, IndexOutOfBoundsException{
		
		FileReader read = new FileReader(filePath);
		
	}
}