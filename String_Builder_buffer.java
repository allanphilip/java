package newpack1;

public class String_Builder_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	StringBuffer s1 = new StringBuffer();
	s1.append("game theory");
	System.out.println(s1.capacity());
	System.out.println(s1);
	
	StringBuilder s2 = new StringBuilder(30);
	s2.append("fifa arena");
	System.out.println(s2.capacity());
	System.out.println(s1);
	
	
	
	
	}

}
