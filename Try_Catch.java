package newpack1;

public class Try_Catch {

	public static void main(String[] args) {
	
	
// TODO Auto-generated method stub
	try
	{
		
	int a =10;
	int b= 0;
	int ar[] = {11,22,33};
	
	int total = a/b;
	System.out.println(total);
	
	
	System.out.println(ar[8]);
	
	}
	catch(ArithmeticException a1)
	{
		System.out.println("error divided by zero " );
	}
	catch(ArrayIndexOutOfBoundsException a2)
	{
		System.out.println("error no index available" );
	}
	
	finally
	{
		System.out.println("executed");
	}
	}

}
