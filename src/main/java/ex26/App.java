package ex26;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App {

    public static void main(String[] args){
        double b, apr, monthlyPayment;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your balance? ");
        b = sc.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? " );
        apr = sc.nextDouble();
        System.out.print("What is the monthly payment you can make? " );
        monthlyPayment = sc.nextDouble();

        System.out.printf("It will take you %.0f months to pay off this card.",PaymentCalculator.calculateMonthsUntilPaidOff(b, apr, monthlyPayment));
    }


}


