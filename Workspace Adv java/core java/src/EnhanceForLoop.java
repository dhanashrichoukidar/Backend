
public class EnhanceForLoop {




	public static void main(String abc[])
	{
		double percent[]; // Declaration of array.
		percent = new double[5]; // instance/Object creation
		percent[0] = 77.8;
		percent[2] = 87.65;

		
		System.out.println("=========enhance for loop==================");
			for(double variable : percent) {
				System.out.println(variable);
			}

	}
}