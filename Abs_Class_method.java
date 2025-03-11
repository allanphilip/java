package newpack1;

abstract class abs_class1 {
	abstract void add();

	abstract void sub();

}

abstract class abs_class2 extends abs_class1 {
	abstract void mul();

	abstract void div();
}

public class Abs_Class_method extends abs_class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abs_Class_method a1 = new Abs_Class_method();
		a1.mul();
		Abs_Class_method a2 = new Abs_Class_method();
		a2.div();
		Abs_Class_method a3 = new Abs_Class_method();
		a3.add();
		Abs_Class_method a4 = new Abs_Class_method();
		a4.sub();
		
	}

	@Override
	void mul() {
		int a = 15;
		int b = 25;
		int total = a * b;
		System.out.println("multiplication is " + total);

	}

	@Override
	void add() {
		int a = 10;
		int b = 40;
		int total = a + b;
		System.out.println("Addition is " + total);

	}

	@Override
	void sub() {
		int a = 10000;
		int b = 4340;
		int total = a - b;
		System.out.println("subtraction is " + total);

	}

	@Override
	void div() {

		int a = 10000;
		int b = 4541;
		double total = a / b;
		System.out.println("division is " + total);

	}

}
