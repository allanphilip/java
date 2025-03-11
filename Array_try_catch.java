package newpack1;

public class Array_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		int arr1[] = new int[4];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		System.out.println(arr1[12]);
	}
	catch(ArrayIndexOutOfBoundsException a1 ) 
	{
		System.out.println("Array index out of bound, Exeption");
		System.out.println("error :"+ a1.getMessage());
	}

	System.out.println("program continue");
	}

}
