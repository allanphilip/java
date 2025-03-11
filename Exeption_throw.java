package newpack1;

public class Exeption_throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age =3;

		if (age < 18) {
			throw new IllegalArgumentException("age below");
			
		
		}
		else
		{
			System.out.println("age above");
		}
			//System.out.println("error");
		
		

	}
}
