package week4;

import java.util.*;
public class w4_q1_p1
{
	Scanner sc = new Scanner(System.in);
	private String name; 
	private String cardNo;
	private String expiryMonth;
	private boolean enabled;
	private int pin;
	private int cardType; 
	private int currentCredit; int creditLimit;
	
	public w4_q1_p1(String n, String card_num, String exp_month, boolean card_stat, int card_pin, int ctype, int crr_cr)
	{
		this.name = n; this.cardNo = card_num;
		this.expiryMonth = exp_month; this.enabled = card_stat; 
		this.pin = card_pin; this.cardType = ctype; this.currentCredit = crr_cr;
		this.creditLimit = 10000;
	}//constructor
	
	public int discount(int amount)
	{
		int final_amt=0;
		if(this.cardType==1)
			final_amt = amount = amount*(1/100);
		else if(this.cardType==2)
			final_amt = amount - amount*(2/100);
		else if(this.cardType==3)
			final_amt =  amount - amount*(3/100);
		return final_amt;
	}//discount
	
	public int getpin()
	{
		return this.pin;
	}
	
	public void changePin(int newPin)
	{
		this.pin = newPin;
	}//changePin
	
	public void transact(int amt)
	{
		if(this.enabled)
		{
			System.out.println("Enter pin: ");
			int checkpin = sc.nextInt();
			if(checkpin == this.pin && (this.currentCredit+amt)<=this.creditLimit)
			{
				System.out.println("Transaction Successful!");
				this.currentCredit += discount(amt);
			}//if
			else
				System.out.println("Transaction Not Possible. Credit Limit Exceeded.");
		}//if
		else
			System.out.println("Enable Card Status and Retry.");
	}//transact
	
	public void changeCardStatus(boolean status)
	{
		this.enabled = status;
	}//changeCardStatus
	
	public void display()
	{
		System.out.println("Name on Card: "+this.name);
		System.out.println("Card number: "+this.cardNo);
		System.out.println("Expiry month: "+this.expiryMonth);
		if(this.enabled)
			System.out.println("Card Staus: enabled");
		else
			System.out.println("Card Staus: not enabled");
		if(this.cardType == 1)
			System.out.println("Card type: Sliver");
		else if(this.cardType == 2)
			System.out.println("Card type: Gold");
		else if(this.cardType == 3)
			System.out.println("Card type: Platinum");
		System.out.println("Current Credit: "+this.currentCredit);
		System.out.println("Credit limit: "+this.creditLimit);
	}//display
}//class
