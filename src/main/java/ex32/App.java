package ex32;
import java.util.InputMismatchException;
import java.util.Random;
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
        String input;
        Scanner sc = new Scanner(System.in);

        while (true){
            while (true){
                try{
                    System.out.print("Enter the difficulty level (1, 2, or 3): ");
                    input = sc.nextLine();
                    if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 4){
                        startGame(Integer.parseInt(input));
                        break;
                    }
                    else{
                        throw new NumberFormatException();
                    }
                }
                catch( NumberFormatException e){

                }
            }
            System.out.print("Do you wish to play again (Y/N)? ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("Y")){
                continue;
            }
            else if (input.equalsIgnoreCase("N")){
                break;
            }
        }




    }
    public static void startGame(int difficulty){
        int guesses = 0;
        String input;
        Scanner sc = new Scanner(System.in);
        int randVal = generateRandomInt(difficulty);
        System.out.print("I have my number. What's your guess? ");
        input = sc.nextLine();
        guesses++;
        while (true){
            try{
                if (Integer.parseInt(input) > randVal){
                    System.out.print("Too high. Guess again: ");
                }
                else if (Integer.parseInt(input) < randVal) {
                    System.out.print("Too low. Guess again: ");
                }
                else if (Integer.parseInt(input) == randVal){
                    break;
                }
                else{
                    throw new NumberFormatException();
                }
                input = sc.nextLine();
                guesses++;
            }
            catch( NumberFormatException e){
                System.out.printf("Invalid input. Try again: ");
                guesses++;
            }
        }
        System.out.printf("You got it in %d guesses!\n\n", guesses);
    }
    public static int generateRandomInt(int difficulty){
        Random rand = new Random();
        return rand.nextInt((int)Math.pow(10, difficulty)) + 1;
    }
}


