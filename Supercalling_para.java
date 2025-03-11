package newpack1;
class office
{
	office(int number ,String name)
	{
		System.out.println("empolyee " +name+" " +number);
	}
}

public class Supercalling_para extends office{
	Supercalling_para()
	{
		super(985432451,"Rex" );
		System.out.println("details");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Supercalling_para();
	}

}
