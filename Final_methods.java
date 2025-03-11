package newpack1;
class student
{
	 final void science()
	{
		System.out.println("new chapter");
	}
}

public class Final_methods extends student{
	
	void science1()
	{
		//super.science();
		System.out.println("science chapter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Final_methods f1 = new Final_methods();
		f1.science1();
	}

}
