package week2;
import java.util.Scanner;
public class w2_q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r = sc.nextDouble();
		double d = r*2;
		double circum = 2*(22/7)*r;
		double area = (22/7)*r*r;
		System.out.println("Diameter: "+d);
		System.out.println("Circumferance: "+circum);
		System.out.println("Area: "+area);
		sc.close();
	}//main
}//class
