public class Operator1 {
	public static void main(String arr[]) {
		int a = 5;
		int b = 2;

		//=============Arithmetic Operators==============
		int add = a + b;
		System.out.println("Add : " + add);   // 7
		System.out.println("Sub : " + (a-b)); // 3
		System.out.println("Mul : " + (a*b)); // 10
		System.out.println("Div : " + (a/b)); // 2
		System.out.println("Mod : " + (a%b)); // 1

		byte c = 10;
		c = (byte) (c + 1); // 11
		System.out.println("c = " + c);

		//=============Assignment  Operators==============
		//a+=b; // a = a + b;
		a/=b; // a = a / b;
		System.out.println("a : " + a); // 2

		byte d = 10;
		d += 1; // d = d + 1;
		System.out.println("d = " + d);
		
	}
}



