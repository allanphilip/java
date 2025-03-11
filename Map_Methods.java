package newpack1;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {

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
	m2.putAll(m1);
	System.out.println(m2);
	m2.remove(4);
	m2.replace(3, "ball");
	m2.replace(3, "ball", "bat");
	
	
	for(Map.Entry<Integer, String> e1 :m2.entrySet())
	{
		System.out.println("key:" +e1.getKey()+ 
				"    Value : "+e1.getValue());
		
	}
	
	
	
			} 

}
