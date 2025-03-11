package newpack1;

public class LocalVariableinside_Static_Nonstatic_methods {

	static void add(int a, int b) {
		int total = a + b;
		System.out.println(total);

	}

	void mul(int a, int b) {
		int total = a * b;
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(5, 20);
		LocalVariableinside_Static_Nonstatic_methods l1 = new LocalVariableinside_Static_Nonstatic_methods();
		l1.mul(25, 50);

	}

}
