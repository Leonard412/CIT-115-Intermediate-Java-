/*

 */
package mymathclassdemo;

import java.util.*;



public class Sigma {
    
    static Scanner input = new Scanner(System.in);

    public static int Sigma(int s){
        int a = 0;
        for(int i=1;i<=s;i++){
            if(s%i==0)
            a = a + i;

        }
    return a;

    }
    public static void main(String[] args) {
        System.out.println("Please enter the number you want to perform the sigma function on");
        int s = input.nextInt();
        Sigma.Sigma(s);
        System.out.print(" is the sum of all the divisors of your input" ); 
        }

}
