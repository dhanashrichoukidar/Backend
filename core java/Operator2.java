public class Operator2 {
	public static void main(String arr[]) {
		int a = 10;
		int b = 5;
		int c = 10;

		//========Relational Operator=========
		boolean ans = a>b;
		System.out.println("a>b = " + ans); // true
		System.out.println("a<b = " + (a<b)); // false
		System.out.println("a>=b = " + (a>=b)); // true
		System.out.println("a>=c = " + (a>=c)); // true
		System.out.println("a<=c = " + (a<=c)); // true
		System.out.println("a==b = " + (a==b)); // false
		System.out.println("a==c = " + (a==c)); // true
		System.out.println("a!=c = " + (a!=c)); // false
		
		//======Increment and Decrement===========
		int x = 10;

// Post incrment (First values will assign and then perform addition)
		//x++; // x = x + 1;
		System.out.println("x++ : " + x++); // 10

// Pre incrment (First addition will perform and then assigns value)
		//++x; // x = x + 1;
		System.out.println("++x : " + ++x); // 12


		int y = 5;
		System.out.println("y-- : " + y--); // 5
		System.out.println("--y : " + --y); // 3

	}
}








