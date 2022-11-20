package Polymorphism;

public class OverridingDemo {

		public static void main(String[] args) {
			//Child child = new Child();
			//child.printIntro("Child");
			
			Parent obj = new Child(); // Polymorphic Object
			obj.printIntro("Abc"); // Runtime polymorphism
		}
	}

	class Parent {
		void printIntro(String name) {
			System.out.println("Hello I am Parent.... My Name is : " + name);
		}
		
		final public void m() {
			System.out.println("This is a m() method....");
		}
	}

	class Child extends Parent {
		protected void printIntro(String name) {
			System.out.println("Hello I am Child.... My Name is : " + name);
		}	
	}