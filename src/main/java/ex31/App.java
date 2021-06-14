package ex31;
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
        String msg = "", msg2 = "";
        Scanner sc = new Scanner(System.in);

        while (true){
            try{

                System.out.print("Resting pulse: ");
                msg = sc.nextLine();
                if (Double.parseDouble(msg) > 0){
                    break;
                }

            }
            catch(NumberFormatException e){

            }
        }
        while (true){
            try{

                System.out.print("Age: ");
                msg2 = sc.nextLine();
                if (Double.parseDouble(msg2) > 0){
                    break;
                }

            }
            catch(NumberFormatException e){

            }
        }
        printHeartRates(Double.parseDouble(msg), Double.parseDouble(msg2));

    }
    public static Double calculateTargetHeartRate(double restingHeart, double age, double intensity){
        double heartRate = 0;
        heartRate = restingHeart + (((220 - age) - restingHeart)*intensity);
        return heartRate;

    }
    public static void printHeartRates(double restingHeart, double age){
        System.out.printf("Intensity   | Rate");
        System.out.printf("\n------------|--------");

        for (int i = 55; i <= 95; i++) {
            System.out.printf("\n%d%% \t\t| %.0f bpm", i, calculateTargetHeartRate(restingHeart, age, (double)i / 100));
        }
    }

}


