package newpack1;

import java.util.Scanner;

public class To_charArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter the word :");
		String in  =   s1.next();
		
	char ch[] = in.toCharArray();
		
		System.out.println(ch[2]);
		s1.close();
	}

}
