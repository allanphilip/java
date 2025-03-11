package newpack1;

public class MethodOverloading {

	static void add(int a, int b) {
		int total = a + b;
		System.out.println(total);
	}

	void add(double a, double b) {
		double total = a + b;
		System.out.println(total);

	}

	void add(String a) {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		m.add("allan");
		m.add(250.23, 23.4);
		add(24, 54);
	}

}
