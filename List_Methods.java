package newpack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//add methods
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
	
	l2.addAll(l1);
	System.out.println(l2);
	
	//l2.addAll(3, l1);
	//System.out.println(l2);
	
	Collections.sort(l2);
	System.out.println(l2);
	l2.remove(2);
	System.out.println(l2);
	l1.toArray();
	
	System.out.println(l2.size());
	boolean b1 = l2.contains("fire");
	System.out.println(b1);
	
	}

}
