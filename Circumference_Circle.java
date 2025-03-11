package newpack1;

import java.util.Scanner;

public class Circumference_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the radius value of r: ");
		int a = s1.nextInt();
		double pivalue = Math.PI;
		double circumference = 2 * pivalue * a;
		s1.close();
		System.out.println("Circumference of cicrcle: " + circumference);

	}

}
