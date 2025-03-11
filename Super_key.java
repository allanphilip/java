package newpack1;
class solve
{
	void mul(int a, int b, int c)
	{
		int tot = a*b*c;
		System.out.println("parent total " +tot);
	}
	
}

public class Super_key extends solve {
	
	void add(int a, int b,int c)
	{
		super.mul(25, 23, 45);
		int tot = a*b+c;
		System.out.println("child total "+tot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super_key s1 = new Super_key();
		s1.add(35, 34, 45);
	}

}
