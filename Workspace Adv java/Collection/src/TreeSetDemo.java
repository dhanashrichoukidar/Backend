
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//TreeSet set = new TreeSet(Collections.reverseOrder());
		TreeSet set = new TreeSet();
		set.add(123);
		set.add(432);
		set.add(324);
		set.add(54);
		set.add(123);
		set.add(33);
		set.add(12);
		set.add(3);
		
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.higher(54)); // always return the grater values than the provided value
		System.out.println(set.lower(54)); // always return the small values than the provided value
		
		System.out.println(set.ceiling(54)); // return the equal or grater values than the provided value
		System.out.println(set.floor(54)); // return the equal or smaller values than the provided value
		
		System.out.println(set.headSet(40));
		System.out.println(set.tailSet(40));
		
		
		/*ArrayList list = new ArrayList();
		list.addAll(set);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		*/
	}
}