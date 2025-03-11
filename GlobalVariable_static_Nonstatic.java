package newpack1;

public class GlobalVariable_static_Nonstatic {

	static int a = 1000;
	int x = 25;

	static void add() {

		int b = 500;
		int total = a + b;
		System.out.println(total);

	}

	void mul() {
		int b = 200;
		int total = a * b + x;
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		GlobalVariable_static_Nonstatic m1 = new GlobalVariable_static_Nonstatic();
		m1.mul();

	}

}
