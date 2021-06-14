package ex27;
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
        String firstName, lastName, EmpId, ZIP;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter the last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter the ZIP code: ");
        ZIP = sc.nextLine();
        System.out.print("Enter the employee ID: ");
        EmpId = sc.nextLine();

        System.out.print(validateInput(firstName, lastName, EmpId, ZIP));
    }
    public static String validateFirstName(String str){
        String msg = "";
        if (str.length() < 2 && str.length() != 0){
            msg += "The first name must be at least 2 characters long.";
        }
        else if (str.length() < 2 && str.length() == 0){
            msg += "The first name must be at least 2 characters long.\n";
        }

        if (str.length() == 0){
            msg += "The first name must be filled in.";
        }
        return msg;
    }
    public static String validateLastName(String str){
        String msg = "";
        if (str.length() < 2 && str.length() != 0){
            msg += "The last name must be at least 2 characters long.";
        }
        else if (str.length() < 2 && str.length() == 0){
            msg += "The last name must be at least 2 characters long.\n";
        }
        if (str.length() == 0){
            msg += "The last name must be filled in.";
        }
        return msg;
    }
    public static String validateEmpID(String str){
        char x[] = str.toCharArray();
        int i  =0;
        if (str.length() != 7){
            return "The employee ID must be in the format of AA-1234.1";
        }
        while (i < 2){
            if (!Character.isAlphabetic(x[i])){
                return "The employee ID must be in the format of AA-1234.2";
            }
            i++;
        }
        if (x[i] != '-'){
            return "The employee ID must be in the format of AA-1234.3";
        }
        i++;
        while (i < 7){
            if (!Character.isDigit(x[i])){
                return "The employee ID must be in the format of AA-1234.4";
            }
            i++;
        }
        return "";
    }
    public static String validateZipCode(String str){
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                return "The zipcode must be a 5 digit number.";
            }
        }
        return "";
    }
    public static String validateInput(String firstName, String lastName, String EmpId, String zipCode){
        String msg = "";

        if (validateFirstName(firstName).length() != 0){
            msg += validateFirstName(firstName) + "\n";
        }
        if (validateLastName(lastName).length() != 0) {
            msg += validateLastName(lastName) + "\n";
        }
        if (validateEmpID(EmpId).length() != 0){
            msg += validateEmpID(EmpId) + "\n";
        }
        if (validateZipCode(zipCode).length() != 0){
            msg += validateZipCode(zipCode);
        }
        if (msg.length() == 0 || msg == null){
            msg = "There were no errors found.";
        }
        return msg;
    }
}


