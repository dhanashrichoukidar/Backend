package Keywords;
class TestThis4 {  
	
public static void main(String args[]) {  
	
P a=new P();  
a.n();  
a.m();

	}
}  

class P {
	
void m() {
	System.out.println("hello m");
	}  

void n(){  
System.out.println("hello n");  
//m();//same as this.m() 
this.m();
	}  
}  

