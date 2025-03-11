package newpack1;

import java.util.Scanner;

public class Area_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int h = s1.nextInt();
		System.out.print("Enter the bredth: ");
		int b = s1.nextInt();
		double area = 0.5 * h * b;
		System.out.print("Area of triangle: " + area);
		s1.close();

	}

}
