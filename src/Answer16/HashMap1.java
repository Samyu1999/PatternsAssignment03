package Answer16;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put( 10,"Amit");
		hm.put( 8,"Amit");
		hm.put( 10,"Vijay");
		hm.put( 7,"Rahul");
		System.out.println("-----------Hash Map---------");
		System.out.println(hm.entrySet());


	}

}
