/*
Show some of the gotcha's in references.
CIT 130
1/27/2015
 */

package demoreferences;

/**
 *
 * @author lhawk20
 */
public class DemoReferences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoldI hi1 = new HoldI();
        System.out.println("hi1 = " + hi1);
        HoldI hi2 = new HoldI(33);
        System.out.println("hi2 = " + hi2);
        HoldI hi3 = new HoldI(hi2);
        System.out.println("hi3 = " + hi3);
        hi3.setI(12);
        // At this point hi2 should = 33 and hi3 should = 12;
        System.out.println("hi2 = " + hi2);
        System.out.println("hi3 = " + hi3);
    }
    
}
