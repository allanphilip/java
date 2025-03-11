package newpack1;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StringBuffer sb1 = new StringBuffer("hello test");
	sb1.append(" New");
	System.out.println(sb1);
	System.out.println(sb1.insert(6, "fake "));
	System.out.println(sb1.replace(6, 9, "great"));
	System.out.println(sb1.delete(18, 21));
	
	StringBuffer sb2 = new StringBuffer("test scenario");
	sb2.reverse();
	System.out.println(sb2);
	System.out.println(sb1.substring(0, 6));
	
	
	}

}
