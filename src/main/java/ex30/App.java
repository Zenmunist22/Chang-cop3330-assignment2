package ex30;
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
        printMultiplicationTable();

    }
    public static void printMultiplicationTable(){
        for (int i = 1; i <= 12; i++){
            for (int j = 1; j <= 12; j++){
                System.out.printf("%5d", i * j);
            }
            if (i == 12){
                break;
            }
            System.out.println();
        }
    }
}


