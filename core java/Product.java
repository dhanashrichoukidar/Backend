
/*Task-1
Create a Product Class with Id, Name, price and quantity varaibles
Create a cart using List of Product and add some product details(objects) into it.
Print the Billing Information into following format
Id	name		Price		Quantity
1	Mobile		22333		1
2	Pendrive	500		2
-------------------------------------------------------------
Total payable Amount: 23333
*/


public class Product {

	private int ID;
	private String Name;
	private double Price;
	private int Quantity;
	
	
	public Product(int ID, String Name, double Price, int Quantity) {
		this.ID = ID;
		this.Name= Name;
		this.Price= Price;
		this.Quantity= Quantity;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
	//	Price = Price*Quantity;
		return Price;
		
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	}


