package newpack1;

class math {
	void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Parent class sum " + sum);
	}
}

public class Method_Overriding extends math {
	void addition(int a, int b) {
		int sum = a + b;
		System.out.println("child class sum is " + sum);
		// System.out.println("the sum ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overriding m1 = new Method_Overriding();
		m1.addition(34, 34);

	}

}
