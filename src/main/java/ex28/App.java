package ex28;
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
        int arr[] = new int[5];
        System.out.printf("The total is %s.", getSum(getInput(arr)));
    }
    public static int[] getInput(int arr[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        return arr;
    }
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i =  0; i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

}


