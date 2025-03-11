package newpack1;

class Adding
{
	static void sum()
	{
	

	System.out.println("adding two number");
}
}
public class Upcasting_class extends Adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Adding a = new Adding();
	Object o1 = (Object)a ;

	System.out.println(o1);
	}

}
