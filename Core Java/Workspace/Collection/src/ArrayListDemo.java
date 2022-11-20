
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		int x = 200;
		list.add("Hello"); // String class Object
		list.add(123); // Integer wrapper class Object
		list.add(12.23); // Double wrapper class Object
		list.add(true); // Boolean wrapper class Object
		list.add(x);
		list.add(123);
		
		System.out.println("Original List : " + list);
		
		System.out.println(list.contains(300)); // to check single object is present inside collection or not.
		System.out.println(list.remove("Hello")); // used to remove the single object from collection
		System.out.println("After Removal : " + list);
		
		System.out.println(list.size());
		
		list.clear(); // to remove all the values form the collection
		
		System.out.println("After clear : " + list);
		
		System.out.println(list.isEmpty()); // to check whether collection is empty or not
	
		System.out.println("=============================================");
		
		ArrayList list1 = new ArrayList();
		list1.add(456);
		list1.add(432);
		list1.add("Abc");
		list1.add('X');
		list1.add(34.56);
		list1.add(456);
		
		System.out.println("Original : " + list1);
		
		list1.add(2, "PQR");
		
		System.out.println("After Add : " + list1);
		
		list1.remove(1);
		
		System.out.println("After Remove : " + list1);
		
		System.out.println(list1.get(3));
		
		list1.set(3, 111);
		
		System.out.println("After set : " + list1);
		
	}

}