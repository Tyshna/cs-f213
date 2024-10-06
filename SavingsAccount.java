package week6;

public class SavingsAccount
{

	  private static double annualInterestRate = 0.0;
	  private double savingsBalance;

	  public SavingsAccount(double savingsBalance) {
	    this.savingsBalance = savingsBalance;
	  }//constructor

	  public void calculateMonthlyInterest() {
	    double monthlyInterest = savingsBalance * annualInterestRate / 12;
	    savingsBalance += monthlyInterest;
	  }//calculateMonthlyInterest

	  public static void modifyInterestRate(double newInterestRate) {
	    annualInterestRate = newInterestRate;
	  }//modifyInterestRate

	  public double getSavingsBalance() {
	    return savingsBalance;
	  }//getSavingsBalance
	}//class