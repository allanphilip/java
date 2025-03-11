package newpack1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the size fo array: ");
		int arr1[] = new int[s1.nextInt()];

		System.out.println("enter the array1 : ");
		for (int i = 0; i <= arr1.length - 1; i++) {

			arr1[i] = s1.nextInt();

		}
		System.out.println("enter the array2 : ");

		int arr2[] = new int[arr1.length];

		for (int i = 0; i <= arr2.length - 1; i++) 
		{
			
			arr2[i] = s1.nextInt();
		}
		s1.close();
		boolean b1 = Arrays.equals(arr1, arr2);
		System.out.println(b1);

	}

}
