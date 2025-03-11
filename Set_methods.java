package newpack1;

import java.util.HashSet;
import java.util.Set;

public class Set_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<String> s1 = new HashSet<>();
	s1.add("classmates");
	s1.add("notebook");
	s1.add("parker");
	s1.add("pencil");
	s1.add("pencil");
	System.out.println(s1.size());
	Set<String> s2 = new HashSet<>();
	s2.add("Matchbox");
	s2.add("tools");
	s2.add("marker");
	s2.add("Stand");
	s2.add("speakers");
	System.out.println(s2.size());
	
	System.out.println(s2.addAll(s1));
	System.out.println(s2);
	
	boolean b2 = s1.contains("parker");
	System.out.println(b2);
	boolean b1 = s1.isEmpty();
	System.out.println(b1);
	
	}

}
