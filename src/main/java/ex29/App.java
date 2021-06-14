package ex29;
import java.util.InputMismatchException;
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
        String msg;
        Scanner sc  = new Scanner(System.in);
        while (true){
            try{
                System.out.print("What is the rate of return? ");
                msg = sc.nextLine();
                if (Double.parseDouble(msg) > 0){
                    break;
                }
                if (Double.parseDouble(msg) == 0){
                    throw new NumberFormatException();
                }
            }
            catch(NumberFormatException e){
                System.out.print("Sorry. That's not a valid input.\n");
            }

        }
        System.out.printf("It will take %.0f years to double your initial investment.", Math.ceil(calculateYearsNeeded(Double.parseDouble(msg))));

    }
    public static Double calculateYearsNeeded(Double x){
        return 72 / x;
    }
}


