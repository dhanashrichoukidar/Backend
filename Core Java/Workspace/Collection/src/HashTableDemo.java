
import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable map = new Hashtable();

		map.put(12, "Abc");
		map.put(112, "Xyz");
		map.put(1.2, "Abc");
		map.put(true, "Abc");
		map.put("Xyz", false);
		map.put(12, "Demo");
		
		System.out.println(map);

		map.remove("Xyz");

		System.out.println(map);

		System.out.println(map.containsKey(12));
		System.out.println(map.containsValue("Abc"));

		System.out.println(map.size());
		System.out.println(map.isEmpty());
	}

}