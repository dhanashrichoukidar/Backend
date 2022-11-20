package Abstraction;

public class MultipleInheritance {

	public static void main(String[] args) {

	}
}

interface I1 {
	public void m1();
}

interface I2 {
	public void m2();
}

interface I3 {
	public void m3();
}

//	One interface can extends more than one interface.
interface I4 extends I1, I2, I3 {
}
// 	One class can implements more than one interface.
abstract class Demo implements I1, I2, I3 {
	
}
//  One class can at a time extends another class and implements the interfaces.
abstract class Test extends Demo implements I1, I2, I3 {
	
}








