package week5;

public class w5_q3_p1
{
	private int dirham;
	private int fills_50;
	private int fills_25;
	private float total;
	
	public w5_q3_p1(int d, int f50, int f25)
	{
		this.dirham = d;
		this.fills_50 = f50;
		this.fills_25 = f25;
	}//constructor
	
	public void add_dirham(int a)
	{
		this.dirham += a;
	}//add_dirham
	
	public void remove_dirham(int b)
	{
		this.dirham -= b;
	}//remove_dirham
	
	public void add_fill50(int a)
	{
		this.fills_50 += a;
	}//add_fill50
	
	public void remove_fills50(int b)
	{
		this.fills_50 -= b;
	}//remove_fills50
	
	public void add_fill25(int a)
	{
		this.fills_25 += a;
	}//add_fill25
	
	public void remove_fills25(int b)
	{
		this.fills_25 -= b;
	}//remove_fills25
	
	public void total_cash()
	{
		this.total = (1.0f*this.dirham) + (0.5f*this.fills_50) + (0.25f*this.fills_25);
		System.out.println("Total cash in purse: "+this.total);
	}//total_cash
}//class
