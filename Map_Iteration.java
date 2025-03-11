package newpack1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1001, "match");
		m1.put(1002, "box");
		m1.put(1003, "park");
		m1.put(1004, "fox");
		
		Set<Entry <Integer,String>> s1  = m1.entrySet();
	
		Iterator<Entry<Integer,String >> i1 = s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
