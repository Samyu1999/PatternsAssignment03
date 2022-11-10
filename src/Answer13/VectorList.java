package Answer13;

import java.util.*;
import java.io.*;

public class VectorList {
	
	public static void main(String[] args) {
		
		List<String> list =  new ArrayList<String>();
		list.add("Bawarchi");
		list.add("DesiBites");
		list.add("Aha");
		
		//System.out.println("List of Restaurants are: ");
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		Vector<String> v = new Vector<String>();
		v.add("KansasCity");
		v.add("St.Louis");
		v.add("Charlotte");
		
		System.out.println("Cities are: ");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.hasMoreElements());
		
		}
	}

}
