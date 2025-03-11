package newpack1;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 100;
		int a = 100;
		if (a == b) {
			if (a < b) {
				System.out.println("equal");
			}
		} else {
			System.out.println("Not equal");
		}
		if (a >= b)
			System.out.println("wrong");
	}

}
