package ex33;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App {

    public static void main(String[] args){
        String input;
        Scanner sc = new Scanner(System.in);
        List<String> lst = new ArrayList<String>();
        lst.add("Yes");
        lst.add("No");
        lst.add("Maybe");
        lst.add("Ask again later");

        System.out.print("What's your question?\n> ");
        input = sc.nextLine();

        System.out.printf("\n%s.", lst.get(generateRandInt()));

    }
    public static int generateRandInt(){
        Random rand = new Random();
        return rand.nextInt(4);
    }
}


