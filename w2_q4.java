package week2;

import java.util.Scanner;
public class w2_q4
{
	public static void main(String args[])
	{
		int num[] = new int[5];
		int pos=0; int neg=0; int zero=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			num[i] = sc.nextInt();
			if(num[i]>0)
				pos++;
			else if (num[i]<0)
				neg++;
			else
				zero++;			
		}//for
		System.out.println("positive: "+pos+"\nnegative: "+neg+"\nzero: "+zero);
		sc.close();
	}//main
}//class
