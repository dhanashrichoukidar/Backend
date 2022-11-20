public class StringDemo1
{
	public static void main(String arr[])
	{
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "Hello";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("********Using == operator********");
		System.out.println(str1 == str2); // false
		System.out.println(str2 == str4); // true
		System.out.println(str1 == str3); // false
		System.out.println("********Using .equals()********");
		System.out.println(str1.equals(str2)); // true
		System.out.println(str2.equals(str4)); // true
		System.out.println(str1.equals(str3)); // true

	}

}