package newpack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s2 = new HashSet<>();
		s2.add("Matchbox");
		s2.add("tools");
		s2.add("marker");
		s2.add("Stand");
		s2.add("speakers");
		System.out.println(s2.size());
		
		for(Iterator<String> i1 = s2.iterator();i1.hasNext();)
				{
					System.out.println(i1.next());
				}
		
	}

}
