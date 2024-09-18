package week4;

import java.util.*;
public class w4_q2_p2
{
	String id_1; String name_1; int dept_1; float basic_1;
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		sc.nextLine();
		System.out.print("Enter employee id: ");
		this.id_1 = sc.nextLine();
		System.out.print("Enter employee name: ");
		this.name_1 = sc.nextLine();
		System.out.println("Enter Department: 1 for staff, 2 for accounts and 3 for admin");
		this.dept_1 = sc.nextInt();
		if(dept_1<1||dept_1>3)
		{
			System.out.print("invalid input");
			System.exit(0);
		}//if
		System.out.print("Enter basic salary: ");
		this.basic_1 = sc.nextFloat();
	}//input
	
	public static void main(String args[])
	{	
		w4_q2_p2 obj = new w4_q2_p2();
		System.out.println("Employee 1:");
		obj.input();
		w4_q2_p1 emp_1 = new w4_q2_p1(obj.name_1, obj.id_1, obj.dept_1, obj.basic_1);
		emp_1.calculateSalary();
		emp_1.DisplayDetails();
		//employee1
		System.out.println("Employee 2:");
		obj.input();
		w4_q2_p1 emp_2 = new w4_q2_p1(obj.name_1, obj.id_1, obj.dept_1, obj.basic_1);
		emp_2.calculateSalary();
		emp_2.DisplayDetails();
		//employee2
		System.out.println("Employee 3:");
		obj.input();
		w4_q2_p1 emp_3 = new w4_q2_p1(obj.name_1, obj.id_1, obj.dept_1, obj.basic_1);
		emp_3.calculateSalary();
		emp_3.DisplayDetails();
		//employee3
	}//main
}//class
