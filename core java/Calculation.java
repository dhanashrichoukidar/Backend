public class Calculation {
	public static void main(String arr[]) {
		System.out.println("Main Started");

		Calculation calc;  // reference varaible
		calc = new Calculation(); // Object/instance of the class

		calc.add();
		calc.sub(22,6);
 		double result1 = calc.div();
		int result2 = calc.mul(3, 5);

		System.out.println("div : " + result1);
		System.out.println("mul : " + result2);

		if(result2 % 2 == 0) {
			System.out.println(result2 + " is a event number");
		} else {
			System.out.println(result2 + " is a odd number");
		}
		System.out.println("Main Ends");
	}

	public void add() {
		int a= 10, b=20;
		System.out.println("Add : " + (a+b));
	}

	public void sub(int a, int b) {
		int ans = a - b;
		System.out.println("Sub : " + ans);
		return;
	}

	public double div() {
		double a = 4, b=5;
		double ans = a/b;
		return ans;
	}
	
	public int mul(int a, int b) {
		int ans = a * b;
		return ans;
	}
}