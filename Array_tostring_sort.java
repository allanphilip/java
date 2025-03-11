package newpack1;

import java.util.Arrays;

public class Array_tostring_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr1[] = new int[4];
	arr1[0] = 5;
	arr1[1] = 2;
	arr1[2] = 1;
	arr1[3] = 9;
	
	System.out.println("array to string" +Arrays.toString(arr1));
	
	Arrays.sort(arr1);
	
	System.out.println("sorrted" +Arrays.toString(arr1));
	
	
	}

}
