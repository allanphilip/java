package newpack1;

public class Final_Variable {

	static void add() {
		final int a = 100;
		int b = 200;
		b = 1210;
		int total = a + b;

		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
	}

}
