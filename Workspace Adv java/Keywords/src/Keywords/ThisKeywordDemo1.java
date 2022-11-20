package Keywords;

public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
	}
}


class Demo {
	int a = 10;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void print() {
		int a = 20;
		System.out.println("a : " + a);
		System.out.println("this.a : " + this.a); // access the instance variables using this keyword
		this.test(); // access methods by using this keyword
	}
	
	public void test() {
		System.out.println("Dummy test method");
	}
}