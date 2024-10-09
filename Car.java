package week7;

import java.util.*;
public class Car
{
	String Vehicle_id;
	float cost[] = new float[3];
	float total; float grand_total;
	
	public Car()
	{
		this.Vehicle_id = "";
		this.total = 0.0f;
	}//default constructor
	
	public void calc_total()
	{
		for(int i=0;i<3;i++)
		{
			this.total += this.cost[i];
		}//for
	}//calc_total
	
	public void calc_grand_total()
	{
	    this.grand_total = this.total * (1 - 0.1f);
	}//calc_grand_total
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter total cars sold:");
		int n = sc.nextInt();
		sc.nextLine();
		Car obj1[] = new Car[n];
		for(int i=0;i<n;i++)
		{
			obj1[i] = new Car();
			sc.nextLine();
			System.out.println("Enter Vehicle ID");
			obj1[i].Vehicle_id = sc.nextLine();
			System.out.println("Enter Base Cost");
			obj1[i].cost[0] = sc.nextFloat();
			System.out.println("Enter Exercise Duty");
			obj1[i].cost[1] = sc.nextFloat();
			System.out.println("Enter Sales Tax");
			obj1[i].cost[2] = sc.nextFloat();
			obj1[i].calc_total();
			obj1[i].calc_grand_total();
		}//for
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Vehicle ID: "+obj1[i].Vehicle_id);
			System.out.println("Base Cost: "+obj1[i].cost[0]);
			System.out.println("Exercise Duty: "+obj1[i].cost[1]);
			System.out.println("Sales Tax: "+obj1[i].cost[2]);
			System.out.println("Total Amount: "+obj1[i].total);
			System.out.println("Grand Total Amount: "+obj1[i].grand_total);
			System.out.println();
		}//for
		sc.close();
	}//main
}//class
