package newpack1;

class add {
	static void apple() {
		System.out.println("add apples");
	}
}

class sub extends add {
	static void orange() {
		System.out.println("add oranges");
	}
}

public class Multilevel_Inheritance extends sub {
	static void grape() {
		System.out.println("add grapes");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grape();
		orange();
		apple();

	}

}
