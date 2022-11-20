
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(67.56);
		list.add(71.56);
		list.add(77.56);
		list.add(87.56);
		list.add(51.56);
		
		System.out.println(list);
		
		System.out.println("==========Iterate Collection using Iterator==========="); 
		double sum =0.0;
		Iterator<Double> it =  list.iterator();
		
		while(it.hasNext()) // to check if next element is present or not
		{
			double val = it.next(); // get the element the next position
			sum+=val;
			System.out.println(val);
		}
		
		System.out.println("Average is : " + (sum/list.size()));
		
		System.out.println("==========Iterate Collection using Enhance For Loop==========="); 
		double addition = 0.0;
		for(double val : list ) {
			addition += val;
			System.out.println(val);
		}
		System.out.println("Average is : " + (sum/list.size()));
		
	}

}