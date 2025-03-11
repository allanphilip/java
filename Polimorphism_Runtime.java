package newpack1;

class Maths
{
	void add()
	{
		System.out.println("adding two digit");
	}
}

public class Polimorphism_Runtime extends Maths{
	void add()
	{
		System.out.println("add all");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polimorphism_Runtime r1 = new Polimorphism_Runtime();
		r1.add();
	}

}
