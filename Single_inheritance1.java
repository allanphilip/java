//child class
package newpack1;

public class Single_inheritance1 extends Singlelevel_inheritance2 {

	static void mul() {
		int a = 25;
		int b = 34;
		int mul = a * b;
		System.out.println(mul);
	}

	void name() {
		String name = "tom";
		System.out.println(name);
	}

	public static void main(String[] args) {

		mul();
		sub();
		Single_inheritance1 s1 = new Single_inheritance1();
		s1.name();

		System.out.println("inheriting from 2 to 1");
	}
}
