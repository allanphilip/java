package newpack1;

import java.util.HashMap;
import java.util.Map;

public class Map_methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1, "match");
		m1.put(2, "box");
		m1.put(3, "park");
		m1.put(4, "fox");
		//System.out.println(m1);
		
		Map<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(5, "orange");
		m2.put(6, "apple");
		m2.put(7, "grape");
		m2.put(8, "lime");
	
		boolean b1 = m1.containsKey(1);
		System.out.println(b1);
		
		boolean b2 = m1.containsValue("park");
		System.out.println(b2);
		boolean b3 = m1.equals(m2);
		System.out.println(b3);
		
		System.out.println(m1.get(1));
		m1.putIfAbsent(5, "mark");
		System.out.println(m1);
		
				
	
	
	
	}
	
	

}
