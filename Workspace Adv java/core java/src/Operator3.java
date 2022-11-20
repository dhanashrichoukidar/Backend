public class Operator3
{
	public static void main(String ar[])
	{
		int a = 10;
		int b = 12;
	
		System.out.println("a&b : "+ (a & b)); // 8
		System.out.println("a|b : "+ (a | b)); // 14

		System.out.println("true&false : "+ (true & false)); // false 
		System.out.println("true|false : "+ (true | false)); // true

		System.out.println("!true : "+ !true); // false

		int c = 1000; // print true if value is between 1-500 else print false
		System.out.println(c>=1 & c<=500); // t & f // f


		System.out.println("true && false : "+ (false && true)); // false  
		System.out.println("true || false : "+ (true || false)); // 
		

		int y = 10; // if y>50 print "Yes" else print "No"
		// if(y>50) is true then "Yes" else "No"
		String value = (y>50) ? "Yes" : "No"; 
		System.out.println(value);



		

	}
}