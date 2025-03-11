package newpack1;

public class String_equals_Equalignore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = "clownfish";
	boolean b1 = s.equals(s);
	System.out.println(b1);
	boolean b2  = s.equalsIgnoreCase("CloWnFisH");
	System.out.println(b2);
	}

}
