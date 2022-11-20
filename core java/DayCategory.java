/* Task:
Print the Day using day number using switch case
Day = 1,2,3,4,5 : Working Day
Day = 6,7 : Weekend 
Any other value = Invalid Day
*/


public class DayCategory
{
	public static void main(String args[])
	{
		int day = 21;
		switch(day)
		{
			case 1: case 2: case 3: case 4: case 5:
			System.out.println("Working Day");
			break;
			case 6: case 7:
			System.out.println("Weekend");
			break;
			default:
			System.out.println("Invalid Day");
		}
	}
}
