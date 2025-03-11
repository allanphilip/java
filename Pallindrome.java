package newpack1;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s1 = new Scanner(System.in);
	System.out.print("enter the word :");
	String str =  s1.next();
	String rev = "";
	int len = str.length();
	
	
	for(int i =len-1;i>=0;i--)
	{
		char ch = str.charAt(i);
		rev = rev+ch;
				
	}
	s1.close();
	if(str.equals(rev))
	{
		System.out.println("its a palindrome");
	}
	else
	{
		System.out.println("its not a palindrome");
	}
	}

}
