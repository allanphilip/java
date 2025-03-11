package newpack1;

public class Combination_Static_Nonstatic {

	static void add() {
		int a = 35;
		int b = 45;
		int total = a + b;
		System.out.println(total);

	}

	void mul() {
		int a = 450;
		int b = 23;
		int total = a * b;
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Combination_Static_Nonstatic x = new Combination_Static_Nonstatic();
		x.mul();
		add();
	}

}
