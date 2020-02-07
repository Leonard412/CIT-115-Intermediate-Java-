/*
Make 2 classes WrapperShallow and WrapperDeep.
Each class is simply a wrapper class to hold a private array variable. 
int [] a;
The default constructor for each class should initialize “a”.
Each class should have a toString() and equals().
Each class should have a setArray method that allows you 
to set the “a” variable
 */

package wrappertest;

public class WrapperTest {


    public static void main(String[] args) {
     WrapperShallow ws1 = new WrapperShallow();
     WrapperShallow ws2 = new WrapperShallow(ws1);
     WrapperDeep wd = new WrapperDeep();
     WrapperDeep wd2 = new WrapperDeep(wd);
     
     System.out.println("*****Testing Shallow Objects*****");
     System.out.println("Initial shallow object contains: ");
     System.out.println(ws1);
     System.out.println("Copy shallow object contains:");
     System.out.println(ws2);
     ws1.setArray();
     System.out.println("Initial shallow object changed to: ");
     System.out.println(ws1);
     System.out.println("Copy shallow object not changed contains: ");
     System.out.println(ws2);
     
    if(ws1.equals(ws2)){
         System.out.println("Jinkies! Both objects equal each other even"
         + "though one object was changed");
        }
    else{
        System.out.println("Good job! The objects do not equal each other."
        + "Good code!");
        }
    
    System.out.println("\n");
    
    System.out.println("*****Testing Deep Objects*****");
    System.out.println("Initial deep object contains: ");
    System.out.println(wd);
    System.out.println("Copy deep object contains:");
    System.out.println(wd2);
    wd.setArray();
    System.out.println("Initial deep object changed to: ");
    System.out.println(wd);
    System.out.println("Copy deep object not changed contains: ");
    System.out.println(wd2);
    
    if(wd.equals(wd2)){
        System.out.println("Jinkies! Both objects equal each other even"
         + "though one object was changed");
        }
    else{
        System.out.println("Good job! The objects do not equal each other."
        + "Good code!");
        }
    }
    
}
