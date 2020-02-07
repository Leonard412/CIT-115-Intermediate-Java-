/*
Demonstrate pass by value and pass by reference
Leonard Hawkes
CIT 130
1/29/2015
 */


package swapsdemo;

/**
 *
 * @author kmoore
 */
public class SwapsDemo {


    public static void main(String[] args) {
        int p = -3, q = 45;
        System.out.println("p q = " + p + " " + q);
        Swaps.swapValue(p,q);// will not swap p & q
        System.out.println("p q = " + p + " " + q);
        int [] arr = new int[2];
        arr[0] = 89;
        arr[1] = -9;
        System.out.println("arr[0] arr[1] = " + arr[0] + " " + arr[1]);
        Swaps.swapReference(arr);// will swap 
        System.out.println("arr[0] arr[1] = " + arr[0] + " " + arr[1]);
    }
    
}
