package week5;

import java.util.*;
public class w5_q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float arr[] = new float[10];
		float max = arr[0]; float sum = 0;
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextFloat();
			sum += arr[i];
			if(arr[i]>max)
				max = arr[i];
		}//for
		float min = arr[0];
		for(int i=0;i<10;i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}//for
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		System.out.println("Average: "+(sum/10));
		}//main
}//class
