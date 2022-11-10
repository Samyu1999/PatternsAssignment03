package Answer1;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Virat Kohli");
		list.add("Rohit Sharma");
		list.add("Sachin Tendulkar");
		 
		  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}

}
