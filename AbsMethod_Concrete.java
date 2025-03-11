package newpack1;
abstract class absclass1
{
	abstract void add();
	abstract void sub();
	void mul()
	{
		System.out.println("multiplication ");
	}
	static void div()
	{
		System.out.println("divison");
	}
	
}

public class AbsMethod_Concrete extends absclass1 {

	
		

	@Override
	void add() {
		// TODO Auto-generated method stub
	int a = 40;
	int b=34;
	int tot = a+b;
	System.out.println("addition "+tot);
	
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		int a = 40;
		int b=34;
		int tot = a-b;
		System.out.println("subtraction "+tot);
		
	}
	
	public static void main(String[] args) {
	
		AbsMethod_Concrete ab1 = new AbsMethod_Concrete();
		ab1.add();
		AbsMethod_Concrete ab2 = new AbsMethod_Concrete();
		ab2.sub();
		AbsMethod_Concrete ab3 = new AbsMethod_Concrete();
		ab3.mul();
		div();
		
}
}
