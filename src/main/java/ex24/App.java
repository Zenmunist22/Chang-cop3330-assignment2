package ex24;


import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String input2 = sc.nextLine();

        if (isAnagram(input1, input2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", input1, input2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", input1, input2);
        }
    }
    public static boolean isAnagram(String s1, String s2){
        int arr[] = new int[256];
        int arr2[] = new int[256];
        Arrays.fill(arr, 0);
        Arrays.fill(arr2, 0);
        for (int i = 0; i < s1.length() && i < s2.length(); i++){
            arr[s1.charAt(i)]++;
            arr2[s2.charAt(i)]++;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
}


