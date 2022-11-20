
import java.util.Scanner;
import java.util.Arrays;

public class Marvel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int Size;
		int Size1;
		int i;
		System.out.print(" Please Enter Number of elements in First array : ");
		Size = sc.nextInt();	
		System.out.print(" Please Enter Number of elements in Second array : ");
		Size1 = sc.nextInt();
		
		int [] a = new int[Size];
		int [] b = new int[Size1];
		boolean c = false;
		System.out.print(" Please Enter " + Size + " elements of First Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.print(" Please Enter " + Size1 + " elements of Second Array  : ");
		for (i = 0; i < Size1; i++)
		{
			b[i] = sc.nextInt();
			if(a[i]!=b[i]) 
			{
						
						System.out.println("not equal");
						System.out.println(c);
					}else {
						System.out.println("equal");
						c= true;
						System.out.println(c);
					}
			
		}

	
		
	}
		}
	/*	a[]= new int[1,2,3,4,5];
		b[]= {1,2,3,4,6};
		Boolean c= false;
		if(a.length==b.length) {
			System.out.println("Arrays are equal");
			
			if(Arrays.equals(a, b)) {

				System.out.println("values inside arrays are equal");
				
			}else {
				System.out.println("values inside arrays are not equal");
			}
			
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		
		// to compare values on specific indexes 
		if(a[0]!=b[0]) {
			
			System.out.println("not equal");
			System.out.println(c);
		}else {
			System.out.println("equal");
			c= true;
			System.out.println(c);
		}
			
		
	}
	

}
*/