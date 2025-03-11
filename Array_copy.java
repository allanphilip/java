package newpack1;

import java.util.Arrays;

public class Array_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr1[] = new int[4];
	arr1[0] = 20;
	arr1[1] = 30;
	arr1[2] = 40;
	arr1[3] = 50;
	
	int arr2[] = new int [arr1.length];
	
	for(int i =0;i<arr1.length;i++)
	{
		arr2[i] = arr1[i];
	}
	System.out.println("input :" +Arrays.toString(arr1));
	System.out.println("output :" +Arrays.toString(arr2));
	
	}

}
