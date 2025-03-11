package newpack1;

public class GlobalVeriable {

	static int x = 100;
	int y = 220;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The result");
		int a = 250;
		int b = 500;
		GlobalVeriable g1 = new GlobalVeriable();

		int total = g1.y * x + a + b;
		System.out.println(total);

	}

}
