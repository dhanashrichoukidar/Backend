public class JaggedArray
{
	public static void main(String ar[])
	{
		int arr[][] = {
			{45,67},  {43,65,87,23},  {3,5,8}
		};

		System.out.println(arr.length); // 3
		System.out.println(arr[0].length); // 2
		System.out.println(arr[1].length); // 4

		for(int r = 0 ; r < arr.length ; r++) {
			for(int c = 0 ; c < arr[r].length ; c++) {
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();
		}

	}
}