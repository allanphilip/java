package newpack1;

import java.util.Scanner;

public class Area_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the value of length: ");
		int l = s1.nextInt();
		System.out.print("Enter the value of breadth: ");
		int b = s1.nextInt();
		int area = l * b;
		System.out.println("Area of triangle: " + area);
		s1.close();
	}

}
