/*
 Leonard Hawkes
 CIT 130
 Programming Assignment 2
 1/19/2015

Write an inflation calculator. Input should be amount, rate of inflation 
and number of years.
Output should be the future value of the amount
 */
package assignment2;

import java.util.*;


public class Assignment2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the current cost of the item (U.S Currency): \n");
        int cost = s.nextInt();
        System.out.println("You entered: " +"$" + cost );
        System.out.println("\n");
        System.out.println("Enter the expected inflation rate per year "
                + "(Enter as a percentage without the percentage sign)");
        
        // needed to pull the enter character out of the input stream.
        s.nextLine(); 
        double interest = s.nextDouble() / 100;
        System.out.println("You entered: " + interest + "%");
        System.out.println("\n");
        
        
        System.out.println("Enter the whole number of years in the future"
                + " to project cost:");
        int years = s.nextInt();
        System.out.println("You entered: " + years + " Years");
        
        
        int n = 1;
        int answer = cost;
        float newPerc = (float) 0.0;
        while (n <= years){
            newPerc = (float) (answer * interest);
            answer = answer + (int)newPerc;
            n++;
            
            System.out.println(answer);
        }
        
    }
    
}
