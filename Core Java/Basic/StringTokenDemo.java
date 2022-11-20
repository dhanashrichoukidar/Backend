import java.util.StringTokenizer;
public class StringTokenDemo
{
	public static void main(String arr[])
	{
		StringTokenizer tk = new StringTokenizer("Abc-20.08.2022-6.30", "-");
		System.out.println(tk.countTokens());
		
		while(tk.hasMoreTokens())
		{
			System.out.println(tk.nextToken());
		}
		
	}
}