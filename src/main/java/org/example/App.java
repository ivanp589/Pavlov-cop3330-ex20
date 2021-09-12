package org.example;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    private prob14 taxprog = new prob14();
    public static void main( String[] args )
    {
        App ask = new App();
        App calc = new App();
        prob14 taxprog = new prob14();
        double amount = taxprog.amount();
        double tax = taxprog.state();
        double additional = ask.county(tax);

        out.println(String.format("The subtotal is $%.2f ",amount));
        out.println(String.format("The tax is $%.2f ",(double)Math.round(amount*additional*100)/100));
        out.println(String.format("The total is $%.2f ",((amount*additional)+amount)));

        // out.println( "Hello World!" );
    }
    private double county(double tax){
        if(tax == .05){
            out.print("What county do you live in? ");
            String str = in.next();
            String str1 = "Eau Claire";
            String str2 = "eau claire";
                if(  str.equals(str1) | str.equals(str2))return tax+.005;
                if(str.equals("Dunn")|str.equals("dunn"))return tax+.004;
                else return tax;}
        else if (tax == .08){
            return tax;}
        else return tax;
    }
}
