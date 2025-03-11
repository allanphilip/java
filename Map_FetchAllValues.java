package newpack1;

import java.util.HashMap;
import java.util.Map;

public class Map_FetchAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1001, "match");
		m1.put(1002, "box");
		m1.put(1003, "park");
		m1.put(1004, "fox");
		
		for(String s1 : m1.values())
		{
			System.out.println(s1);
		}
	}

}
