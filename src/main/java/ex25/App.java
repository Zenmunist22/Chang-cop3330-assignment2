package ex25;
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
        Scanner sc = new Scanner(System.in);
        System.out.println(containsLetters("12345"));
    }
    public static int passwordValidator(String pw){
        /*
        A very weak password contains only numbers and is fewer than eight characters.
        A weak password contains only letters and is fewer than eight characters.
        A strong password contains letters and at least one number and is at least eight characters.
        A very strong password contains letters, numbers, and special characters and is at least eight characters.
         */
        int score = 0;
        // only letters && less than 8
        if (containsLetters(pw) && !containsSpecialCharacters(pw) && !containsNumbers(pw) && pw.length() < 8){
            return score + 2;
        }
        // only numbers && less than 8
        if (!containsLetters(pw) && !containsSpecialCharacters(pw) && containsNumbers(pw) && pw.length() < 8){
            return score + 1;
        }
        // at least one number && letters && at least 8
        if (containsLetters(pw) && !containsSpecialCharacters(pw) && containsNumbers(pw) && pw.length() < 8){
            return score + 3;
        }
        // at least one number && letters && special characters && at least 8
        if (containsLetters(pw) && containsSpecialCharacters(pw) && containsNumbers(pw) && pw.length() < 8){
            return score + 4;
        }

        return score;
    }
    public static boolean containsLetters(String str){
        return str.matches("[a-zA-z]");
    }
    public static boolean containsNumbers(String str){
        return str.matches("[0-9]");
    }
    public static boolean containsSpecialCharacters(String str){
        return str.matches("[^a-zA-Z0-9]");
    }
}


