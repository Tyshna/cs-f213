package week3;
import java.util.*;
public class w3_q1
{
	int atomic_num;
	String name;
	String symbol;
	String chem_class;
	double atomic_wt;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the atomic number");
		this.atomic_num = sc.nextInt();
		System.out.println("enter the name of the element");
		this.name = sc.next();
		System.out.println("enter the chemical symbol");
		this.symbol = sc.next();
		System.out.println("enter the class of the element");
		sc.nextLine();
		this.chem_class = sc.nextLine();
		System.out.println("enter the atomic weight");
		this.atomic_wt = sc.nextDouble();
	}//input
	
	public void display()
	{
		System.out.println("Atomic Number: "+ this.atomic_num);
		System.out.println("Name: "+ this.name);
		System.out.println("Symbol: "+ this.symbol);
		System.out.println("Class: "+ this.chem_class);
		System.out.println("Atomic Weight: "+ this.atomic_wt);
	}//display
	
	public void display_15()
	{
		if(this.atomic_wt>15)
		{
			System.out.println("Atomic Number: "+ this.atomic_num);
			System.out.println("Name: "+ this.name);
			System.out.println("Symbol: "+ this.symbol);
			System.out.println("Class: "+ this.chem_class);
			System.out.println("Atomic Weight: "+ this.atomic_wt);
			System.out.println();
		}//if
	}//display_15
	
	public static void main(String args[])
	{
		w3_q1 obj1 = new w3_q1();
		w3_q1 obj2 = new w3_q1();
		w3_q1 obj3 = new w3_q1();
		System.out.println("Enter element 1"); obj1.input();
		System.out.println("Enter element 2"); obj2.input();
		System.out.println("Enter element 3"); obj3.input();
		System.out.println("Element 1"); obj1.display();
		System.out.println("Element 2"); obj2.display();
		System.out.println("Element 3"); obj3.display();
		System.out.println("Elements with atomic weight greater than 15");
		obj1.display_15(); obj2.display_15(); obj3.display_15();
	}//main
}//class