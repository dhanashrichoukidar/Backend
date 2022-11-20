/**
	Distinction - percent between 75-100
	1st Class - percent between 60-75
	2nd Class - percent between 50-60
	Pass Class - percent between 40-50
*/

public class IfStructure
{
	public static void main(String ar[])
	{
		int percent = 120;
		if(percent >= 40 && percent<=100)
		{
			System.out.println("Congrats..!! You are Pass");
			if(percent>=75 && percent<=100)
			{
				System.out.println("You got a Distinction");
			}
			else if(percent>=60 && percent<75)
			{
				System.out.println("You got a 1st Class");
			}
			else if(percent>=50 && percent<60)
			{
				System.out.println("You got a 2nd Class");
			}
			else
			{
				System.out.println("You got a Pass Class");
			}
		}
		else if(percent >= 0 && percent<40)
		{
			System.out.println("Sorry..!! You are Fail");
		}
		else
		{
			System.out.println("Invalid Percentage..!!");
		}

	}
}