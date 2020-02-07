/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package counterdemo;


public class CounterDemo {


    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("Counter 1's" + c1 );
        System.out.println("Counter 2's" + c2 ); 
        
         if (c1.equals(c2)){
            System.out.println("Counter 1 equals Counter 2");
        }
         else{ System.out.println("Counter 1 does not equal Counter 2");}
         
         c1.addCount();
         c2.minusCount();
         
         
         System.out.println("\n");
         
         System.out.println("Counter 1's" + c1);
         System.out.println("Counter 2's" + c2);
         
          if (c1.equals(c2)){
            System.out.println("Counter 1 equals Counter 2");
        }
         else{ System.out.println("Counter 1 does not equal Counter 2");}
         
        
        }
    
    
}
