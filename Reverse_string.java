package newpack1;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("please enter the value: " );	
	String str =  s1.next();

	String rev ="";
	
	int len = str.length();
	for(int i=len-1;i>0;i--)
	{
		rev = rev+str.charAt(i);
		
	}
	s1.close();
	System.out.println("before reversing : " +str);
	System.out.println("after reversing : "+rev);
	}

}
