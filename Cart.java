import java.util.ArrayList;
import java.util.Iterator;

public class Cart {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Mobile",22333 ,1);
		Product p2 = new Product(2, "Pendrive",500 ,2);
		Product p3 = new Product(3, "Tv",30000 ,1);
		Product p4 = new Product(4, "Mouse",2000 ,1);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		
		Product pr = null;
		double sum = 0.0;
		
		
		System.out.println("===============================using Iterator==================================================");
		Iterator itr = productList.iterator();
		
		System.out.println("ID" +"\t"+ "Name"+"\t"+ "Price"+ "\t" + "Quantity"+ "\t");
		while(itr.hasNext()) // to check if next element is present or not
		{
			Product val =(Product)itr.next(); // get the element the next position
			sum += val.getPrice()*val.getQuantity();
			System.out.println(val.getID()+"\t"+ val.getName()+"\t"+ val.getPrice()*val.getQuantity()+ "\t" + val.getQuantity()+ "\t");
		
		}
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total Payable Ammount : " + sum);
		
			
System.out.println("================================using Enhance For Loop========================================");
		
			double addition = 0.0;
		System.out.println("ID" +"\t"+ "Name"+"\t"+ "Price"+ "\t" + "Quantity"+ "\t");
		for(Product p : productList) {
			
			addition += p.getPrice()*p.getQuantity();
			
			System.out.println(p.getID()+"\t"+ p.getName()+"\t"+ p.getPrice()*p.getQuantity()+ "\t" + p.getQuantity()+ "\t");
			
		}
			System.out.println("--------------------------------------------------------------------");
			
			
			System.out.println("Total Payable Ammount : " + addition );
		
		
		
	
	}
}
