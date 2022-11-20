/*
	Create an array to store the 3 student 5 subject marks.
*/

public class Array2D
{
	public static void main(String abc[])
	{
		/*
		double marks[][];
		marks = new double[3][5];
		marks[0][3] = 77;
		marks[1][2] = 66;
		marks[2][0] = 68;
		marks[2][4] = 65;
		*/
		double marks[][] = { {77,88,99,66,67}
								, {76,67,87,68,61}
								, {71,81,91,61,51} };

		

		
		System.out.println("No. Of Rows : " + marks.length);
		System.out.println("No. Of Columns : " + marks[1].length);



		for (int r = 0 ; r<3 ; r++ ) {
			for(int c = 0 ; c<5 ; c++) {
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}

		
 
	}
}