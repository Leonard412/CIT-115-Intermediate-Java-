/*
Leonard Hawkes
CIT 130
3/20/2015
Implement the following UML for a counter that increments once a second until
 a given number of seconds is reached.
 */

package countermodel;

import java.util.*;


public class CounterModel {
    private int counter;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This progam tests a timer.");
        String go = "y";
        int start = 0;
        int end = 0;
        
        while(go.equals("y") || go.equals("Y")){
            System.out.println("Enter a start number of seconds");
            start = input.nextInt();
            System.out.println("Enter an end number of seconds");
            end = input.nextInt();
                CounterController cc = new CounterController(start,end);
                cc.Start();
            System.out.println("Would you like to continue?" + "y/n"); 
            go = input.next();
        }
                    
    }
    public CounterModel(int c ){
            counter = c;
    } 
    
    public void Increment(){
       try{
          Thread.sleep(1000);  
       }
       catch(InterruptedException e){
           e.printStackTrace();
       }
       counter++;
       CounterView cv = new CounterView();
       cv.Display(counter);
    }
    
}
