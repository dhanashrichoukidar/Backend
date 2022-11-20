public class Array1D
{
	public static void main(String abc[])
	{
		double percent[]; // Declaration of array.
		percent = new double[5]; // instance/Object creation
		percent[0] = 77.8;
		percent[2] = 87.65;

		System.out.println(percent[0]); // 77.8
		System.out.println(percent[1]); // 0.0
		System.out.println(percent[2]); // 87.65
		System.out.println(percent[3]); // 0.0
		System.out.println(percent[4]); // 0.0

		System.out.println("==========for loop=================");
		for(int i = 0 ; i<=4 ; i++) {
			System.out.println(percent[i]);
		}
		

		System.out.println("=======Enhance for Loop====================");
		for(double val:percent)
			{
				System.out.println(val);
			}
	}
}
