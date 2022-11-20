public class CommandLine
{
	public static void main(String args[])
	{
		System.out.println("Command Line Args");
		System.out.println("Name : " + args[0]);
		System.out.println("Id : " + args[1]);

		int num1 = Integer.parseInt(args[2]);
		int num2 = Integer.parseInt(args[3]);

		System.out.println("Sum : " + (num1 + num2));
	}
}