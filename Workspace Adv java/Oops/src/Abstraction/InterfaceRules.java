package Abstraction;

public class InterfaceRules {

	public static void main(String[] args) {
		Vehicle vh = new AudiA8Ev(); // Polymorphic Object
		vh.brand();
		vh.noOfWheels();
		vh.fuelType();
	}
}
interface Vehicle {
	int a = 10;   // public static final int a = 10;
	void brand(); // public abstract void brand()
	public abstract void noOfWheels();
	public void fuelType();
}

abstract class Car1 implements Vehicle {
	public void noOfWheels() {
		System.out.println("Car has 4 wheels");
	}
}

class AudiA8Ev extends Car1 {
	public void brand() {
		System.out.println("Brand : Audi");
	}
	
	public void fuelType() {
		System.out.println("Fuel Type : Electric");
	}
}







