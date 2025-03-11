package newpack1;

public class String_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1 =new StringBuilder("new game");
		s1.append(" test");
		System.out.println(s1);
		System.out.println(s1.insert(4, "fake "));
		System.out.println(s1.replace(9, 13, "replace"));
		System.out.println(s1.delete(4, 8));
		
		StringBuilder s2 = new StringBuilder();
		s2.append("helicopter");
		System.out.println(s2);
		s2.reverse();
		System.out.println("Reverse :"+s2);
		
		System.out.println(s1.substring(0, 3));
		
		
	}

}
