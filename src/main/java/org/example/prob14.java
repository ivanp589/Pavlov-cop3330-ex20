
package org.example;


        import java.util.Scanner;

        import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class prob14 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        //App math = new App();
        prob14 ask = new prob14();
        double amount = ask.amount();
        double tax = ask.state();


    }
    public int amount(){
        out.print("What is the order amount? ");
        return in.nextInt();
    }
    public double state(){
        double tax;
        String str1 = "Wisconsin";
        String str11 = "wisconsin";
        String str2 = "Illinois";
        String str22 = "illinois";
        out.print("What is the state? ");
        String str = (in.next());
        //  out.println(str);
        if(str1.equals(str)|str11.equals(str)) return tax = .05;
        else if(str2.equals(str)|str22.equals(str)) return tax = .08;
        return 0;
    }
}