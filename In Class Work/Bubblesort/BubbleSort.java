/*
Show a bubble sort - a bad idea for large data sets
Leonard Hawkes
CIT 130
1/29/2015
 */
package bubbleSort;
import java.util.Random;


public class BubbleSort {


    public static void main(String[] args) {
        Random r = new Random();
        int [] a = new int[10];
        for(int i = 0; i < a.length; i++)
            a[i] = r.nextInt(100);
        for(int element: a)
            System.out.println(element);
        bubbleSort(a);
        System.out.println("after sort");
        
        
        for(int element: a)
            System.out.println(element);
        
    }
    // O(N^2) algorithmic effort
    private static void bubbleSort(int [] z){
        // for N times
        for(int i = 0; i < z.length; i++)
            
            // compare an if out of order swap
            for(int j = 0; j < z.length-1; j++)
                if(z[j] > z[j+1]){
                    int temp = z[j];
                    z[j] = z[j+1];
                    z[j+1] = temp;
                }
    }
    
}
