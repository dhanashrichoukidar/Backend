import java.util.*;  
public class DequeDemo {  
   public static void main(String[] args) {  
   //Creating Deque and adding elements  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");    
   //Traversing elements  
   for (String str : deque) {  
   System.out.println(str);  
   }  
  
   Deque de = new ArrayDeque();
   de.add(123);
   de.add("A");
   de.add(12.6);
   de.add(123);
   de.add("Hello");
   
   System.out.println(de);
   
   System.out.println(de.removeLast());
   System.out.println(de);
   
   de.addFirst(1232);
   System.out.println(de);
   
  
   }  
}  