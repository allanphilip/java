package newpack1;

import java.util.Scanner;

public class Circumference_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the value of length: ");
		int a = s1.nextInt();
		int circumference = 4 * a;
		System.out.println("Circumference of square: " + circumference);
		s1.close();
	}

}
