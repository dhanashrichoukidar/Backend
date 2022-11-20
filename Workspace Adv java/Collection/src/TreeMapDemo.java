
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();

		map.put(12, "Abc");
		map.put(112, "Xyz");
		map.put(132, "Abc");
		map.put(1, "Abc");
		map.put(21, false);
		map.put(23, "Demo");
		map.put(999, null);

		System.out.println(map);

		
		System.out.println(map.higherKey(12)); // 21
		System.out.println(map.lowerKey(12)); // 1
		System.out.println(map.ceilingKey(12)); // 12
		System.out.println(map.floorKey(12)); // 12
		
		System.out.println(map.higherEntry(12));
		System.out.println(map.lowerEntry(12));
		System.out.println(map.ceilingEntry(12));
		System.out.println(map.floorEntry(12));
		
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		
		System.out.println(map.headMap(20));
		System.out.println(map.tailMap(20));
		
		NavigableMap map2 = map.descendingMap();
		System.out.println(map2);
		
		
	}
}