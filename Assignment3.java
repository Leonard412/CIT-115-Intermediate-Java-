/*
Leonard Hawkes
CIT 130
Assignment 3
2/5/2015

Research and implement the Sieve of Eratosthenes (also called prime sieve) 
algorithm. Researching and implementing algorithms is
something I did frequently while consulting and any programmer must 
be able to do this.
 */

package assignment3;

import java.util.*;

public class Assignment3 {


    public static void main(String[] args) {
        // Get the maximum of our prime numbers
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum prime number: ");
        N = sc.nextInt();
        sc.close();
        
        //Initiate our numbers array, where true displays prime number
        boolean[] isPrime = new boolean[N]; // makes an array of N variables
        // each variable is either true or false.
        isPrime[0] = false;
        for(int c = 1; c < N; c++){
            isPrime[c] = true;
            
        }
        
        // Check every number >= 2 for primality
        for (int i = 2; i <= N; i++){
            
            // i is prime if it hasn't been deleted
            if (isPrime[i-1]){
                
                // print out prime number
                System.out.println(i);
                
                // delete all subsequent numbers of i
                //for(int p = 2*i; p <= N; p += i){
                for(int p = i*i; p <= N; p += i){ // more efficient
                    isPrime[p-1] = false;
                    
                }
            }
        }
        
    }
    
}
