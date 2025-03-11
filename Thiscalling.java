package newpack1;

public class Thiscalling {
	
	Thiscalling()
	{	this("Tom");
		System.out.println("value ");
	}
	
	Thiscalling(String name)
	{
		this(11832007);
		System.out.println(name);
	}
	
	Thiscalling(int number)
	{
		System.out.println(number);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	new Thiscalling();
	
	
	}

}
