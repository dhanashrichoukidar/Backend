/*
Task-2
WAP to print the string value in reverse.
In -> Hello
Out -> olleH
Hint: use toCharArray method to convert string into array and print array into reverse order.
*/



public class StringReverse
{
	public static void main(String Arr[])
	{
		String s1 = "Hello";
		char[] ch = s1.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--)
		{
            System.out.print(ch[i]);
		}

	}
}