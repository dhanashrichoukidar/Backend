package Inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		ch.demo();
	}
}

class Parent {
	int a = 10;
	int b = 20;
	public void printPrson() {
		System.out.println("a " + a);
		System.out.println("b " + b);
	}
}


class Child extends Parent {
	
	public void demo() {
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
	}
}




