public class ObjectImpl
{
	public static void main(String arr[])
	{
		Product p1 = new Product();
		Product p2 = new Product();
		p1.setProductDetails(12, 345.34, 5);
		p2.id = 23;
		p1.printProduct();
		p2.printProduct();
	}
}
// local variable : i, p, q
// instance variable : id, price, quantity
class Product
{
	int id;
	double price;
	int quantity;
	public void setProductDetails(int i, double p, int q)
	{
		id = i;
		price = p;
		quantity = q;
	}
	public void printProduct()
	{
		System.out.println("=====Product Details=====");
		System.out.println("Id : " + id);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
	}
}