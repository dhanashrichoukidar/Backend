public class StringBuilderDemo
{
	public static void main(String arr[])
	{
		StringBuilder sbr1 = new StringBuilder("Hello");
		System.out.println("Original : "+ sbr1);
		sbr1.append(" Program");
		System.out.println("After append : "+ sbr1); // Hello Program
		sbr1.insert(6, "Java ");
		System.out.println("After insert : "+ sbr1); // Hello Java Program
		sbr1.replace(0, 5, "Hi");
		System.out.println("After replace : "+ sbr1); // Hi Java Program
		sbr1.reverse();
		System.out.println("After everse : "+ sbr1); // margorP avaJ iH
	}
}