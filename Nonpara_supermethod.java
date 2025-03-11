package newpack1;
class animal
{
	animal(String name,int age)
	{
		System.out.println("lion: "+name+ " "+age);
	}
}

public class Nonpara_supermethod extends animal {
	Nonpara_supermethod()
	{
		super("leo",5);
		System.out.println("the data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Nonpara_supermethod();
	}

}
