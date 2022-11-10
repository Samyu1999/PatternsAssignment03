package Answer14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsSync {
	public static void main(String[] args) {
		List<String> sports = new ArrayList<String>();
		sports.add("Cricket");
		sports.add("Football");
		sports.add("Basketball");
		sports.add("Baseball");
		
		sports = Collections.synchronizedList(sports);
		
		synchronized(sports) {
			Iterator<String> s = sports.iterator();
			while(s.hasNext()) {
				System.out.println(s.next());
			}
		}
		
	}

}
