package sample;

import java.util.*;

public class CarLoan 
{
	public static void main(String[] args) 
	{
		System.out.println("Plese enter your principal");
        Scanner scan = new Scanner(System.in);
        int carLoan = scan.nextInt();
        System.out.println(carLoan);
        
        System.out.println("Plese enter your loan length");
        Scanner scan2 = new Scanner(System.in);
        int loanLength = scan2.nextInt();
        System.out.println(loanLength);
        
        System.out.println("Plese enter your yealy rate");
        Scanner scan3 = new Scanner(System.in);
        double interestRate = scan3.nextDouble();
        System.out.println(interestRate);
        
        System.out.println("Plese enter your downPayment");
        Scanner scan4 = new Scanner(System.in);
        int downPayment = scan4.nextInt();
        System.out.println(downPayment);
        
//        int carLoan = 100000; 
//        int loanLength = 30; 
//        int interestRate = (int) 3.92; 
//        int downPayment = 0;
  
        if (loanLength <= 0 || interestRate <= 0) 
        {
    		System.out.println("Error! You must take out a valid car loan.");
        } 
        else if (downPayment >= carLoan) 
        {
            System.out.println("The car can be paid in full.");
        } 
        else 
        {
            int remainingBalance = carLoan - downPayment; 
            int months = loanLength * 12;
    double monthlyBalance = remainingBalance / months;
          	double interest = (monthlyBalance * interestRate) / 100;
          	double monthlyPayment = (monthlyBalance + interestRate); 
          	System.out.println(monthlyPayment);
    	}
	}
}