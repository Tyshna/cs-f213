package week6;

import java.util.Scanner;

public class TestSavingsAccount {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the initial balance for account 1: ");
    double balance1 = scanner.nextDouble();
    System.out.print("Enter the initial balance for account 2: ");
    double balance2 = scanner.nextDouble();
    System.out.print("Enter the initial balance for account 3: ");
    double balance3 = scanner.nextDouble();
    SavingsAccount[] accounts = new SavingsAccount[3];
    accounts[0] = new SavingsAccount(balance1);
    accounts[1] = new SavingsAccount(balance2);
    accounts[2] = new SavingsAccount(balance3);
    System.out.print("Enter the annual interest rate: ");
    double annualInterestRate = scanner.nextDouble();
    SavingsAccount.modifyInterestRate(annualInterestRate);
    System.out.println("Balances after setting interest rate to " + annualInterestRate * 100 + "%:");
    for (SavingsAccount account : accounts) {
      account.calculateMonthlyInterest();
      System.out.println(account.getSavingsBalance());
    }//for

    scanner.close();
  }//main
}//class