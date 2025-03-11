//Area of circle using scanner
package newpack1;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Area_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
			System.out.print("Enter the radius value of r : ");

			int r = s1.nextInt();
			double pivalue = Math.PI; //
			double area = pivalue * r * r;

			s1.close();
			System.out.println("Area of circle: " + area);
		

	}

}
