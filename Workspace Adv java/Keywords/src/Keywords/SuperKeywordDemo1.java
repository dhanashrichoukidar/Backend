package Keywords;

public class SuperKeywordDemo1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.print();
	}
}


class Parent {
	int x = 30;
	public void m() {
		System.out.println("from Parent class");
	}
}

class Child extends Parent {
	int x = 10;
	public void m() {
		System.out.println("from Child class");
	}
	public void print() {
		int x = 5;
		System.out.println("x : " + x);
		System.out.println("this.x : " + this.x);
		System.out.println("super.x : " + super.x); // access the variable from parent class
		super.m(); // access the method of parent class
	}
}