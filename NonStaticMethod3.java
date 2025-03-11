package newpack1;

public class NonStaticMethod3 {

	void add() {
		int a = 30;
		int b = 35;
		int total = a + b;
		System.out.println(total);

	}

	void sub() {
		int a = 75;
		int b = 20;
		int total = a - b;
		System.out.println(total);
	}

	void mul() {
		double a = 50.5;
		double b = 34.5;
		double total = a * b;
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod3 n = new NonStaticMethod3();
		n.add();

		NonStaticMethod3 n1 = new NonStaticMethod3();
		n1.sub();
		n1.mul();

	}
}
