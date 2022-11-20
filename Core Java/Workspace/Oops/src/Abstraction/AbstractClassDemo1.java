package Abstraction;

public class AbstractClassDemo1 {

public static void main(String[] args) {
		Vehical vh = new Activa();
		vh.noOfWheels();
		vh.fuel();
		vh.brand();
		vh.type();
	}
}

abstract class Vehical {
	public static final void classDetails() {
		System.out.println("This is a Vehical class.....");
	}
	public abstract void noOfWheels();
	public abstract void type();
	public abstract void fuel();
	public abstract void brand();
}

abstract class Bike extends Vehical {
	public void noOfWheels() {
		System.out.println("This is a 2 wheeler Vehical..");
	}
	
	public void type() {
		System.out.println("Vehical Type : Bike"); 
	}
}

class Activa extends Bike {
	public void fuel() {
		System.out.println("Fuel Type : Petrol");
	}
	public void brand() {
		System.out.println("Brand : Honda");
	}
}




