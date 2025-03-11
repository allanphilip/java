package newpack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeption_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner s1 = new Scanner(System.in);
		
			System.out.print("Enter the radius value of r : ");

			int r = s1.nextInt();
			double pivalue = Math.PI; //
			double area = pivalue *r*r;

			s1.close();
			System.out.println("Area of circle: " + area);
		} catch (InputMismatchException a1) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter the valid digit");
			System.out.print("Enter the radius value of r : ");

			int r = s1.nextInt();
			double pivalue = Math.PI; //
			double area = pivalue *r*r;
			s1.close();
			System.out.println("Area of circle: " + area);
			
		}finally 
		{
			System.out.println("got fixed");
		}
		
		

	}
}
