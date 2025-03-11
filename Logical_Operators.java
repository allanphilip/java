package newpack1;

public class Logical_Operators {

	static void And() {
		// TODO Auto-generated method stub
		int a = 430;
		int b = 343;

		if (a == b && a >= b) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}

	static void Or() {
		// TODO Auto-generated method stub
		int a = 430;
		int b = 343;

		if (a == b || a >= b) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}

	static void AndNot() {
		// TODO Auto-generated method stub
		int a = 430;
		int b = 343;

		if (!(a == b || a >= b)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}

	static void OrNot() {
		// TODO Auto-generated method stub
		int a = 430;
		int b = 343;

		if (!(a == b || a >= b)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {

		And();
		Or();
		AndNot();
		OrNot();
	}

}
