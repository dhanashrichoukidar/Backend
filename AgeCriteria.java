/**
WAP to get the Age category.
Given : int age = 20;
Output:
	Print one of the following result.
	Child Age if age between 0-17
	Teen Age if age between 18-22
	Adult Age if age between 23-60
	Old Age if age between 60-110
	If not between 0-110 then print Invalid Age
*/




public class AgeCriteria
{
public static void main(String args[])
	{
		int age = 20;
		if(age >= 0 && age <= 110) 
		{
			if(age <= 17 && age >= 0)
			{
				System.out.println("Child Age");
			}
				else if(age <= 22 && age >= 18)
			{
				System.out.println("Teen Age");
			}
				else if(age <= 60 && age >= 23)
			{
				System.out.println("Adult Age");
			}
				else if(age >= 61 && age <=110)
			{
				System.out.println("Old Age");
			}
		}
		else 
			{
				System.out.println("Invalid Age");
			}
	}
}