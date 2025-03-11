package newpack1;

public class NonStaticMethod {

	void add() {
		int a = 15;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticMethod n = new NonStaticMethod();
		n.add();

	}

}
