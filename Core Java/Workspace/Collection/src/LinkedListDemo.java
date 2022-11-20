
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("Hello");
		list.add(1.23);
		list.add(true);
		list.add(123);
		list.add(1, "XYZ");
		System.out.println(list);
		
		list.addFirst("111");
		list.addLast("999");
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
		list.getFirst();
		list.getLast();
		
		list.push(5555); // add element at the first position
		System.out.println("After Push : " + list);
		list.pop(); // select and removes first element from the LinkedList 
		System.out.println("After pop : " + list);
		System.out.println(list.peek()); // select the element and not remove it from the list.
		System.out.println("After peek : " + list);
		System.out.println(list.poll()); // select and removes the first element from the list
		System.out.println("After poll : " + list);
	}
}