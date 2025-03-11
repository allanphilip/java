package newpack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Collection<Integer> c1 = new ArrayList<>();
	c1.add(10);
	c1.add(15);
	c1.add(35);
	c1.add(45);
	c1.add(23);
	
	Collection<String> c2 = new ArrayList<>();
	c2.add("science");
	c2.add("geography");
	c2.add("English");
	c2.add("games");
	c2.add("maths");
	
	Iterator<Integer> i2  =  c1.iterator();
	
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
	Iterator<String> i3 = c2.iterator();
	
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
	
	}

}
