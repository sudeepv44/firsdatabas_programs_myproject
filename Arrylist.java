package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arrylist {
	
	public static void main(String [] args) {
		
	
// non Generic
	
	ArrayList <Object>  s =new <Object> ArrayList();
	ArrayList   s1 =new  ArrayList();
      s1.add(1);
      s1.add("sudeep");
      s1.add("c");
      s.addAll(s1);
      LinkedList <Object> f = new LinkedList();
      f.add("sudeep");
      f.add('c');
      f.add(123);
      f.add(11.2);
      f.add(11.1f);
      f.size();
//      f.getFirst();
    f.getLast();
    
      
//      f.remove();
      
      System.out.println(s1);
      System.out.print(s.add(s));
     System.out.println(f);
}

	

	
	}
