/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recurse;


public class Factorial {
    public static int Factorial(int x){
        System.out.println("Entering factorial x = " + x);
        if(x==1){
            System.out.println("Factorial returning 1 ");
            return 1;
        }
        int y = Factorial(x-1)*x;
        System.out.println("Factorial returning " + y);
        return y;
    }
}
