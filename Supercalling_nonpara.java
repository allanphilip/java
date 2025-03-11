package newpack1;

class school {
	
	school() //  Parent constructor
	{
		String second_name = "ak";
		System.out.println("secondname is : "+second_name);

	}
}

public class Supercalling_nonpara extends school {

	Supercalling_nonpara() { //Child constructor
		
		String first_name = "blade";
		System.out.println("firstname is :" +first_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Supercalling_nonpara();
	}

}
