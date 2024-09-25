package week5;

import java.util.*;
public class w5_q3_p2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int dir; int fill50; int fill25;
		System.out.print("Enter number of dirhams in the purse: ");
		dir = sc.nextInt();
		System.out.print("\nEnter number of 50 fills in the purse: ");
		fill50 = sc.nextInt();
		System.out.print("\nEnter number of 25 fills in the purse: ");
		fill25 = sc.nextInt();
		w5_q3_p1 obj = new w5_q3_p1(dir, fill50, fill25);
		obj.total_cash();
		System.out.println("Enter 1 to add/remove dirham\nEnter 2 to add/remove 50 fills");
		System.out.println("Enter 3 to add/remove 25 fills\nEnter 4 to calculate total cash");
		int ch = sc.nextInt();
		int add_rem; int val;
		switch(ch)
		{
		case 1:
		{
			System.out.println("Enter 1 to add dirham\nEnter 2 to remove dihram");
			add_rem = sc.nextInt();
			if(add_rem == 1)
			{
				System.out.println("Enter no of dirhams to be added");
				val = sc.nextInt();
				obj.add_dirham(val);
			}//if
			else if(add_rem == 2)
			{
				System.out.println("Enter no of dirhams to be removed");
				val = sc.nextInt();
				obj.remove_dirham(val);
			}//else
			obj.total_cash();
			break;
		}//case1
		case 2:
		{
			System.out.println("Enter 1 to add 50 fills\nEnter 2 to remove 50 fills");
			add_rem = sc.nextInt();
			if(add_rem == 1)
			{
				System.out.println("Enter no of 50 fills to be added");
				val = sc.nextInt();
				obj.add_fill50(val);
			}//if
			else if(add_rem == 2)
			{
				System.out.println("Enter no of 50 fills to be removed");
				val = sc.nextInt();
				obj.remove_fills50(val);
			}//else
			obj.total_cash();
			break;
		}//case2
		case 3:
		{
			System.out.println("Enter 1 to add 25 fills\nEnter 2 to remove 25 fills");
			add_rem = sc.nextInt();
			if(add_rem == 1)
			{
				System.out.println("Enter no of 25 fills to be added");
				val = sc.nextInt();
				obj.add_fill25(val);
			}//if
			else if(add_rem == 2)
			{
				System.out.println("Enter no of 25 fills to be removed");
				val = sc.nextInt();
				obj.remove_fills25(val);
			}//else
			obj.total_cash();
			break;
		}//case3
		case 4:
		{
			obj.total_cash();
			break;
		}//case4
		default:
			System.out.println("Invalid Input");
		}//switch
	}//main
}//class