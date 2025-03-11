package newpack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested_ExeptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s1 = new Scanner(System.in);

			System.out.print("Enter the value of length: ");
			int l = s1.nextInt();

			System.out.print("Enter the value of breadth: ");
			int b = s1.nextInt();

			int area = l * b;
			System.out.println("Area of triangle: " + area);
			s1.close();
		} catch (InputMismatchException a1) {
			try {
				System.out.println("provide proper value for 1st try");
				Scanner s1 = new Scanner(System.in);

				System.out.print("Enter the value of length: ");
				int l = s1.nextInt();

				System.out.print("Enter the value of breadth: ");
				int b = s1.nextInt();

				int area = l * b;
				System.out.println("Area of triangle: " + area);
				s1.close();
			} catch (InputMismatchException a2) {
				
				System.out.println("enter proper data for final try");
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

	}

}
