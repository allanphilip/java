package newpack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("classmates");
		l1.add("notebook");
		l1.add("zapper");
		l1.add("pencil");
		l1.add("parker");
	System.out.println("before sorting : "+l1);
	
	Collections.sort(l1);
	
	System.out.println("after sorting : "+l1);
	
	System.out.println("reverse sort: "+l1.reversed());
	
	
	}
	

}
