
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(123);
		set.add("Abc");
		set.add(12.3);
		set.add(123);
		set.add("Abc");
		set.add("Pqr");
		System.out.println(set);
	}
}