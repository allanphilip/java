package newpack1;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Collection<Integer> c1 = new ArrayList<>();
	c1.add(10);
	c1.add(20);
	c1.add(30);
	c1.add(40);
	System.out.println(c1);
	
	Collection<String> c2 = new ArrayList<>();
	c2.add("hello");
	c2.add("testing");
	c2.add("new");
	c2.add("track");
	System.out.println(c2);
	
	Collection <Object>c3 = new ArrayList<>();
	c3.add(14);
	c3.add("time");
	c3.add("wake");
	
	System.out.println(c1.size());
	c1.remove(40);
	System.out.println(c1);
	boolean b1 = c2.contains("testing");
	System.out.println(b1);
	System.out.println(c3.removeAll(c3));
	
	
	
	
	}

}
