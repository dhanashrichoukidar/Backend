/*
Task-1
WAP to store you full name (FN MN LN) and print it in the name as per the 10th marksheet (LN FN MN). Output must be in a capital case.
Hint: Use Split method and get the array of words and print required output using array.
*/



public class SurnameFirst
{

	public static void main(String Arr[])
	{
		
		String s1 = "Dhanashri Dinkarrao Choukidar";
		String upper = s1.toUpperCase();
		String words[]= upper.split(" ");
		
		System.out.println(words[2] + " "+ words[0] + " "+ words[1]);
// OR 

            String s2 = words[0];
		String s3 = words[1];
		String s4 = words[2];
		System.out.println(s4 + " "+ s2 + " "+ s3);

	}
}
