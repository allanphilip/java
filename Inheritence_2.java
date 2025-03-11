package newpack1;

class NewClass {
	void person() {
		String name = "jake";
		String job = "gamer";
		String title = name + " " + " " + job;
		System.out.println(title);
	}
}

public class Inheritence_2 extends NewClass {
	void money() {
		int ctc = 10000;
		int hike = 5000;
		int total = ctc + hike;
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass n1 = new NewClass();
		n1.person();
		Inheritence_2 i1 = new Inheritence_2();
		i1.money();

	}

}
