package newpack1;

interface name {
	void student_1();

}

interface number {
	void student_2();
}

public class Interface_Multiplelevel implements name, number {

	@Override
	public void student_2() {
		// TODO Auto-generated method stub
		int age = 12;
		double height = 156.4;
		System.out.println("student age is " + age + " height is " + height);
	}

	@Override
	public void student_1() {
		// TODO Auto-generated method stub
		int age = 12;
		double height = 146.2;
		System.out.println("student age is " + age + " height is " + height);
	}

	public static void main(String[] args) {

		Interface_Multiplelevel im1 = new Interface_Multiplelevel();
		im1.student_1();
		im1.student_2();
	}

}
