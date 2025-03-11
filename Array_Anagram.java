package newpack1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enetr the 1st string");
	String s1 = sc.next();
	System.out.println("enter the 2nd string");
	String s2 = sc.next();
	
	if(s1.length() != s2.length())
	{
		System.out.println("not an anagram");
	}
	else
	{
		System.out.println("check if it anagram");
	}
	char c1[] = s1.toCharArray();
	char c2[] = s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	boolean b1 = Arrays.equals(c1, c2);
		System.out.println(b1);
		sc.close();
		if(b1==true)
		{
			System.out.println("its anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}
	}

}
