

class TestInterface3 implements Printable1, Showable1 {  
public void print(){
	System.out.println("Hello");
	}  

public static void main(String args[]){  
TestInterface3 obj = new TestInterface3();  
obj.print();  
 } 

}  


interface Printable1{  
void print();  
}  


interface Showable1{  
void print();  
}  
  
