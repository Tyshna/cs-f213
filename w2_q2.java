package week2;

import java.util.Scanner;
public class w2_q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 5 digit number");
		int num = sc.nextInt();
		int d1 = num/10000;
		int d2 = (num%10000)/1000;
		int d3 = (num%1000)/100;
		int d4 = (num%100)/10;
		int d5 = num%10;
		System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5);
		sc.close();
	}//main
}//class