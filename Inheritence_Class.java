package newpack1;

class ParentClass {
	static void add() {
		int a = 50;
		int b = 100;
		int sum = a + b;

		System.out.println(sum);

	}
}

public class Inheritence_Class extends ParentClass {

	void mul() {
		int a = 50;
		int b = 100;
		int total = a * b;
		System.out.println(total);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritence_Class i1 = new Inheritence_Class();
		i1.mul();
		add();
	}

}
