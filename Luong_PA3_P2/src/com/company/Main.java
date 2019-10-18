package com.company;


class SavingsAccount {
    //instance variables
    private double savingsBalance;
    private static double annualInterestRate = 0;
            // constructor
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    // method to modify annual interest rate
    public void modifyInterestRate(double annualInterestRate) {
        this.annualInterestRate = (annualInterestRate / 100);
    }
    // method to calculate monthly interest and returns out new balance
    public double calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance = savingsBalance + monthlyInterest;
        return savingsBalance;

    }

}


public class Main {

    public static void main(String[] args) {
       //run java file Application containing test program
        Application.main(args);
    }
}
