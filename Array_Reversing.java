package newpack1;

import java.util.Arrays;

public class Array_Reversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr1[] = new int[4];
	arr1[0] = 25;
	arr1[1] = 40;
	arr1[2] = 50;
	arr1[3] = 60;
	
	int rev[] = new int [arr1.length];
	
	for(int i=0,j=3; i<=arr1.length-1;i++,j--)
	{
		rev[j] = arr1[i];
	}
	System.out.println("input : " +Arrays.toString(arr1));
	System.out.println("reversed : "+Arrays.toString(rev));
	
	}

}
