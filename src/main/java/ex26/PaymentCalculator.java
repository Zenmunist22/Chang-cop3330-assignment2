package ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayment){
        double months = 0;
        double i = (apr / 100) / 365;
        months = Math.ceil((Math.log(1 + (balance/monthlyPayment) * (1 - Math.pow(1+i, 30)))  /  Math.log(1 + i)) / -30);
        return months;
    }
}
