package newpack1;

public class Constructor_Overloading {

	Constructor_Overloading() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}

	Constructor_Overloading(int a, int b) {

		System.out.println("added paramter");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		new Constructor_Overloading();

		new Constructor_Overloading(4, 5);
	}

}
