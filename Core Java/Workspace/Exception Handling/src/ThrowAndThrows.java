import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThrowAndThrows {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		scan.close();
		try {
			printEmployeeAge(age);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printError();
		}
		
		
		/*try {
			readFileData("c:\\test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/
	}
	
	public static void printEmployeeAge(int age) throws AgeInvalidException {
		if(age>=18 && age<=60) {
			System.out.println("Employee Age is : " + age);
		}
		else {
			throw new AgeInvalidException();
		}	
	}	
	
	
	public static void readFileData(String filePath) throws FileNotFoundException, ArithmeticException, IndexOutOfBoundsException{
		
		FileReader read = new FileReader(filePath);
		
	}
	

}