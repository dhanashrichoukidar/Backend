
public class Array1D {

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

			System.out.println("=========for loop==================");
			for(int i = 0 ; i<=4 ; i++) {
				System.out.println(percent[i]);
			}

			System.out.println("========enhance for loop===================");
				for(double val : percent) {
					System.out.println(val);
				}

			int arr[] = {54,56,57,34,45,7,8,45,75,697,4,673,4,689,45,56};
			System.out.println("No. fo values : " + arr.length);

			}
	}
