
public class StringSplit {

		public static void main(String Arr[])
		{
			String s2 = "Hello-Java-String-Program";
			String words[] = s2.split("-"); //convert string into array of words/string
				
			for(String val : words) 
				{
				System.out.println(val);
				}
		}
	}