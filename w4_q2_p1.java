package week4;

public class w4_q2_p1
{
	private String id;
	private String name;
	private int dept;
	private float basic;
	private float allowance;
	private float totalSalary;
	
	public w4_q2_p1(String name_1, String id_1, int dept_1, float basic_1)
	{
		this.name = name_1; this.id = id_1; this.dept = dept_1;
		this.basic = basic_1;
		if(this.dept==1)
			this.allowance = 1500.0f;
		else if(this.dept==2)
			this.allowance = 2500.0f;
		else
			this.allowance = 3500.0f;
	}//constructor
	
	public void calculateSalary()
	{
		this.totalSalary = this.basic + (.4f*this.basic) + this.allowance;
	}//calculateSalary
	
	public void DisplayDetails()
	{
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		if(this.dept==1)
			System.out.println("Department: Staff");
		else if(this.dept==2)
			System.out.println("Department: Accounts");
		else
			System.out.println("Department: Admin");
		System.out.println("Total Salary: "+this.totalSalary);
	}//displayDetails
}//class
