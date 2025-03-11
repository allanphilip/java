package newpack1;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("classmates");
		l1.add("notebook");
		l1.add("parker");
		l1.add("pencil");
		l1.add("pencil");
		
		System.out.println(l1.size());
		List<String> l2 = new ArrayList<String>();
		l2.add("matchbox");
		l2.add("paper");
		l2.add("fire");
		l2.add("stone");


		ListIterator<String> i1 = l1.listIterator();
		System.out.println("forward : ");
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		for(ListIterator<String> ii1 = l1.listIterator();ii1.hasNext();)
		{
			System.out.println(ii1.next());
		}
		System.out.println("backward :");
		//ListIterator<String> i2 = l1.listIterator();
		
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	}

}
