package newpack1;

interface sum {
	void add();

	void sub();

}

public class Interface_with2abs_methods implements sum {

	// TODO Auto-generated method stub

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 1456;
		int tot = a + b;
		System.out.println("sum " + tot);

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a = 104560;
		double b = 156.45;
		double tot = a - b;
		System.out.println("sub  " + tot);
	}

	public static void main(String[] args) {

		Interface_with2abs_methods i1 = new Interface_with2abs_methods();
		i1.add();
		i1.sub();

	}
}