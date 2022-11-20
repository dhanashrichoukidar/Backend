
	package Keywords;

	import java.util.Scanner;

	public class StaticExample1 {
		public static void main(String[] args) {
			
			System.out.println("b : " + StaticDemo.b); // access static variable by Class Name
			StaticDemo.print(); // access the static method by class name
			
			
		}
	}

	class StaticDemo {
		int a = 10;
		static int b = 20; // static variable
		static String compnayName;
		
		static { // static block
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Name : ");
			compnayName = scan.next();
			scan.close();
		}
		
		public static void print() { // static method
			System.out.println("THis is the static mehod...");
			System.out.println("b : " + b);
		}
		
		
	}
