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
        String input;
        System.out.print("Enter a password: ");
        input = sc.nextLine();
        String msg = "";
        switch (passwordValidator(input)){
            case 1:
                msg = " is a very weak password.";
                break;
            case 2:
                msg = " is a weak password.";
                break;
            case 3:
                msg = " is a strong password.";
                break;
            case 4:
                msg = " is a very strong password.";
                break;
            default:
                msg = " is an invalid password.";
                break;
        }
        System.out.printf("The password \'%s\'%s", input, msg);
    }
    public static int passwordValidator(String pw){
        /*
        A very weak password contains only numbers and is fewer than eight characters.
        A weak password contains only letters and is fewer than eight characters.
        A strong password contains letters and at least one number and is at least eight characters.
        A very strong password contains letters, numbers, and special characters and is at least eight characters.
         */
        int score = 0;
        // only numbers && less than 8
        if (!containsLetters(pw) && !containsSpecialCharacters(pw) && containsNumbers(pw) && pw.length() < 8){
            return score + 1;
        }
        // only letters && less than 8
        if (containsLetters(pw) && !containsSpecialCharacters(pw) && !containsNumbers(pw) && pw.length() < 8) {
            return score + 2;
        }
        // at least one number && letters && at least 8
        if (containsLetters(pw) && !containsSpecialCharacters(pw) && containsNumbers(pw) && pw.length() >= 8){
            return score + 3;
        }
        // at least one number && letters && special characters && at least 8
        if (containsLetters(pw) && containsSpecialCharacters(pw) && containsNumbers(pw) && pw.length() >= 8){
            return score + 4;
        }

        return score;
    }
    public static boolean containsLetters(String str){
        Pattern p = Pattern.compile("[a-zA-z]");
        Matcher m = p.matcher(str);
        return m.find();
    }
    public static boolean containsNumbers(String str){
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(str);
        return m.find();
    }
    public static boolean containsSpecialCharacters(String str){
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher(str);
        return m.find();
    }
}


