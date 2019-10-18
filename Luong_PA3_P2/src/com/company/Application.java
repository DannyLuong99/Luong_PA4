package com.company;




public class Application {

    public static void main(String[] args) {
        // write your code here

        // create 2 SavingsAccount objects and set the balance to 2000 and 3000 respectively.
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        //set annual interest rate to 4%
        saver1.modifyInterestRate(4);
        saver2.modifyInterestRate(4);
        // print out balance for each month for a year
        for (int i = 0; i < 12; ++i) {
            System.out.println("Month: " + (i + 1));
            System.out.println();
            System.out.printf("Saver 1 balance: %.2f\n", saver1.calculateMonthlyInterest());
            System.out.printf("Saver 2 balance: %.2f\n\n", saver2.calculateMonthlyInterest());
        }

        // set annualInterstRate to 5%
        saver1.modifyInterestRate(5);
        saver2.modifyInterestRate(5);

        //print balance for next month with new interest rate
        System.out.println("Month 1 with 5% interest rate");
        System.out.println();
        System.out.printf("Saver 1 balance: %.2f\n", saver1.calculateMonthlyInterest());
        System.out.printf("Saver 2 balance: %.2f\n", saver2.calculateMonthlyInterest());

        //
    }
}
