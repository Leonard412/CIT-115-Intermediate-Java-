/*
Demo ShowStatics which provides standard and static variables
and methods to contrast and compare.
*/
package statics;

/**
 *
 * @author lhawk20
 */
public class Statics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShowStatics ss1 = new ShowStatics();
        // count (a shared variable) should be one
        System.out.println("ss1 " + ss1);
        ShowStatics ss2 = new ShowStatics(-17);
        
        // count should now be 2 for BOTH ss1 and ss2
        System.out.println("ss1 " + ss1);
        System.out.println("ss2 " + ss2);
        ShowStatics ss3 = new ShowStatics(71);
        System.out.println("ss1 " + ss1);
        System.out.println("ss2 " + ss2);
        
        // use output which requires an instance
        System.out.println(ss3.output("ss3"));
        
        // use countout (a static method) with no instance
        System.out.println(ShowStatics.countOut());
        
        
        // Math is a built in static class
        System.out.println(Math.E);
        System.out.println(Math.sqrt(144));
    }
    
}
