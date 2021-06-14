package ex35;
import java.lang.reflect.Array;
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
        ArrayList<String> lst = new ArrayList<String>();
        while (true){
            System.out.print("Enter a name: ");
            input = sc.nextLine();
            if (input.equals("")){
                break;
            }
            lst.add(input);
        }

        System.out.printf("The winner is... %s.", chooseWinner(lst));

    }
    public static String chooseWinner(ArrayList<String> lst){
        return lst.get(generateRandInt(lst.size()));
    }
    public static int generateRandInt(int n){
        return new Random().nextInt(n);
    }
    public static boolean removeFromArray(ArrayList<String> lst, String remove){
        return lst.remove(remove);
    }
}


