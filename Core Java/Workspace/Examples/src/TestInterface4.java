


class TestInterface4 implements Showable2{
	
	public static void main(String args[]){  
		TestInterface4 obj = new TestInterface4();  
		obj.print();  
		obj.show();  
		 }  
	
public void print(){
	System.out.println("Hello");
	}  
public void show(){
	System.out.println("Welcome");
	}  

}  



interface Printable2{  
void print();  
}  


interface Showable2 extends Printable2{  
void show();  
}  
