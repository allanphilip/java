package newpack1;

import java.util.Scanner;

public class Area_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the value of length: ");
		int a = s1.nextInt();
		int area = a * a;
		System.out.println("Area of square:" + area);
		s1.close();
	}

}
