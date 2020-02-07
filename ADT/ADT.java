package adt;

/*
Leonard Hawkes
CIT 130
You are to create an ADT Fraction in its own file.
Fraction must consist of:
2 state variables num (numerator) and den (denominator).
a default and 2 parameter override constructor so you can use new Fraction(); or new Fraction(a,b);
a toString() that produces output like 1/2
an equals(Fraction f) that compares using: return getNum()*f.getDenom() == f.getNum()*getDenom();
 */

import java.util.*;


public class ADT {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
      
        while(choice.equalsIgnoreCase("y")){
            System.out.println("Enter the numerator for the target fraction:");
            int num = sc.nextInt();
            System.out.println("Enter the denominator for the target fraction:");
            int den = sc.nextInt();
            Fraction f1 = new Fraction(num,den);
            System.out.println("\n");
            System.out.println("Enter the numerator for the next fraction to test:");
            int num2 = sc.nextInt();
            System.out.println("Enter the denominator for the next fraction to test:");
            int den2 = sc.nextInt();
            Fraction f2 = new Fraction(num2,den2);
                        
            if(f1.equals(f2)){
                System.out.println("Fraction one equals fraction two");
            }
            else{
                System.out.println("Fraction one does not equal fraction two");
            }

             
        System.out.println("Would you like to continue? (Y/N) ");
        choice = sc.next();
        
    
        }
        

    }
    
}
