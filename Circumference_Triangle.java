package newpack1;

import java.util.Scanner;

public class Circumference_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = s1.nextInt();
		System.out.print("Enter the value of b: ");
		int b = s1.nextInt();
		System.out.print("Enter the value of c: ");
		int c = s1.nextInt();
		int cirtriangle = a + b + c;
		System.out.print("Circumference of triangle: " + cirtriangle);
		s1.close();
	}

}
