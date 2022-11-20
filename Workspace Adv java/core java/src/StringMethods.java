public class StringMethods
{
	public static void main(String arr[])
	{
		String s1 = "Welcome";
		System.out.println("Original Value : " + s1);
		String upper = s1.toUpperCase(); // WELCOME
		System.out.println("uppercase : " +upper);

		String lower = s1.toLowerCase();
		System.out.println("lowercase : " +lower);

		//String add = s1.concat(" Program"); // to add new strig value at the end of exsiting
		String add = s1 + " Program"; 
		System.out.println("concat Value : " + add);

		System.out.println(s1.charAt(2)); // to get a char from a specific index
		System.out.println(s1.indexOf('o'));// to get the index od specific char
		
		String s2 = "Hello-Java-String-Program";
		String words[] = s2.split("-"); //convert string into array of words/string

		for(String val : words) {
			System.out.println(val);
		}

		char[] ch = s1.toCharArray(); // to convert string into array of char
		for(char c : ch) {
			System.out.println(c);
		}

		String s3 = "   Hello   ";
		String s4 = s3.trim(); // to remove the spaces added at the start and end
		System.out.println("Total Char : " + s4.length());

		String s5 = " "; // Empty String
		System.out.println("is Empty : " + s5.isEmpty());
	
	}
}