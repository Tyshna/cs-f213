package week4;

import java.util.*;
public class w4_q1_p2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name on card");
		String n = sc.nextLine();
		System.out.println("Enter card number");
		String c_num = sc.nextLine();
		System.out.println("Enter Expiry date");
		String c_exp = sc.nextLine();
		System.out.println("Enter card status: 1 for enabled and 0 for not enabled");
		int c_stat = sc.nextInt();
		boolean status = true;
		if(c_stat==1)
			status = true;
		else if(c_stat==0)
			status = false;
		else
			System.out.println("Wrong input");
		System.out.println("Enter pin");
		int cpin = sc.nextInt();
		System.out.println("Enter card type: 1 for sliver; 2 for gold; 3 for platinum");
		int typecard = sc.nextInt();
		System.out.println("Enter current credit");
		int current_cr = sc.nextInt();
		w4_q1_p1 obj1 = new w4_q1_p1(n,c_num,c_exp,status,cpin,typecard,current_cr);
		System.out.println("\n\nMenu\nChoose 1 for changing pin\nChoose 2 for making a Transaction\nChoose 3 to change card status\nChoose 4 to display card details");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Enter old pin");
			int checkpin = sc.nextInt();
			int oldpin = obj1.getpin();
			if(checkpin==oldpin)
			{
				System.out.println("Enter new pin");
				int npin = sc.nextInt();
				obj1.changePin(npin);
			}
			break;
		}//case1
		case 2:
		{
			System.out.println("Enter the amount of the transaction");
			int amount = sc.nextInt();
			obj1.transact(amount);
			break;
		}
		case 3:
		{
			System.out.println("Enter new status of the card: 1 for enabled; 0 for not enabled");
			int choice = sc.nextInt();
			if(choice==1)
				obj1.changeCardStatus(true);
			else if(choice == 0)
				obj1.changeCardStatus(false);
			else
				System.out.println("invalid option chosen");
			break;
		}//case3
		case 4:
		{
			obj1.display();
			break;
		}//case4
		default:
			System.out.println("Invalid option");
			break;
		}//switch
		sc.close();
	}//main
	
}//class
