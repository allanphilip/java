package newpack1;

import java.util.Scanner;

public class Array_value_accepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the size fo array: ");
		int age[] = new int[s1.nextInt()];
	
	   for(int i=0; i<age.length; i++)
	   {
		   System.out.println("value at index" + i);
		   age[i] = s1.nextInt();
		   
		  
	   }

	   s1.close();
}

}