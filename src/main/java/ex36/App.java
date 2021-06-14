package ex36;
import java.sql.Array;
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
        double val;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<String>();
        while (true){
            try{
                System.out.print("Enter a number: ");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("done")){
                    break;
                }

                val = Double.parseDouble(input);
                lst.add(input);
            }
            catch(NumberFormatException e){

            }

        }
        System.out.printf("Numbers: ");
        for (int i = 0; i < lst.size();i++){

            if (i == lst.size() - 1){
                System.out.printf("%s\n", lst.get(i));
            }
            else{
                System.out.printf("%s, ",lst.get(i));
            }
        }
        System.out.printf("The average is %.1f\n",average(lst));
        System.out.printf("The minimum is %s\n",(min(lst)));
        System.out.printf("The maximum is %s\n",(max(lst)));
        System.out.printf("The standard deviation is %.2f",std(lst));

    }
    public static double average(ArrayList<String> lst){
        double res = 0;
        for (int i = 0; i < lst.size(); i++){
            res += Double.parseDouble(lst.get(i));
        }
        return res/lst.size();
    }
    public static String max(ArrayList<String> lst){
        int max = 0;
        for (int i = 1; i < lst.size(); i++){
            if (Double.parseDouble(lst.get(max)) < Double.parseDouble(lst.get(i))){
                max = i;
            }
        }
        return lst.get(max);
    }
    public static String min(ArrayList<String> lst){
        int min = 0;
        for (int i = 1; i < lst.size(); i++){
            if (Double.parseDouble(lst.get(min)) > Double.parseDouble(lst.get(i))){
                min = i;
            }
        }
        return lst.get(min);
    }
    public static double std(ArrayList<String> lst){
        ArrayList<String> lst2 = new ArrayList<String>();
        double average = average(lst);
        for (int i = 0; i < lst.size(); i++){
            lst2.add(Double.toString(Double.parseDouble(lst.get(i) )- average));
            lst2.set(i, Double.toString(Math.pow(Double.parseDouble(lst2.get(i)),2)));
        }
        double variance = Math.sqrt(average(lst2));
        return variance;
    }
}


