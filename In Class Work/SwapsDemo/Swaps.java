/*
Demonstrate pass by value and pass by reference
Leonard Hawkes
CIT 130
1/29/2015
 */

package swapsdemo;

/**
 *
 * @author lhawk20
 */
public class Swaps {
    public static void swapValue(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("in swapValue a b = " + a + " " + b);
    }
    
    public static void swapReference(int[] z){
        int temp = z[0];
        z[0] = z[1];
        z[1] = temp;
        System.out.println("in swapReference z[0] z[1] = " + z[0] + " " + z[1]);
    }
    
}
