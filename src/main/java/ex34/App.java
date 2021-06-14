package ex34;
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
        lst.add("John Smith");
        lst.add("Jackie Johnson");
        lst.add("Chris Jones");
        lst.add("Amanda Cullen");
        lst.add("Jeremy Goodwin");

        System.out.printf("There are %d employees:", lst.size());
        for (int i = 0; i < lst.size(); i++){
            System.out.print("\n" + lst.get(i));
        }
        System.out.print("\n\nEnter an employee name to remove: ");
        input = sc.nextLine();
        removeFromArray(lst, input);
        System.out.printf("\nThere are %d employees:", lst.size());
        for (int i = 0; i < lst.size(); i++){
            System.out.print("\n" + lst.get(i));
        }

    }
    public static boolean removeFromArray(ArrayList<String> lst, String remove){
        return lst.remove(remove);
    }
}


