package week7;

import java.util.Scanner;

public class Tables
{
	public static void printTable(int n)
    {
        System.out.println("Number Table:");
        for(int i = 2;i<=n;i++)
        {
        for (int j = 1; j <= 10; j++) 
        {
            int result = i * j;
            System.out.printf("%5d",result);
        }//for_j
        System.out.println();
        }//for_i
    }//printTable
	
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printTable(n);
    }//main
}//class
