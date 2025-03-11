package newpack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("classmates");
		l1.add("notebook");
		l1.add("parker");
		l1.add("pencil");
		l1.add("pencil");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("matchbox");
		l2.add("paper");
		l2.add("fire");
		l2.add("stone");
		
		Iterator<String> i1 = l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
