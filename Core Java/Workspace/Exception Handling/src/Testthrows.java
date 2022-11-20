
import java.io.*;

class M1{
	 void method()throws IOException{
		 throw new IOException("device error");
	 }
	}


class Testthrows4{
   public static void main(String args[])throws IOException{//declare exception
     M1 m=new M1();
     m.method();

    System.out.println("normal flow...");
  }
}


