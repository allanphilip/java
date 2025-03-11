package newpack1;

public class NonStatic_Parameterized_method {

	void add(int a, int b) {
		int total = a + b;
		System.out.println(total);

	}

	void sub(int a, int b) {
		int total = a - b;
		System.out.println(total);
	}

	void mul(int a, int b) {
		int total = a * b;
		System.out.println(total);
	}

	void div(double a, double b) {
		double total = a / b;
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic_Parameterized_method n = new NonStatic_Parameterized_method();
		n.add(543, 234);
		n.sub(543, 233);
		n.mul(2754, 23560);
		n.div(2334, 5);

	}

}
