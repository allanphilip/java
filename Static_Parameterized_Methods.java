package newpack1;

public class Static_Parameterized_Methods {

	static void add(int a, int b) {
		int total = a + b;
		System.out.println(total);
	}

	static void mul(double a, double b) {
		double total = a * b;
		System.out.println(total);
	}

	static void div(int x, int z) {
		double total = x + z;
		System.out.println(total);
	}

	static void person(String name) {
		System.out.println("hello person");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(20, 100);
		mul(15000.23, 23.21);
		div(246, 3);
		person("allan");

	}

}
