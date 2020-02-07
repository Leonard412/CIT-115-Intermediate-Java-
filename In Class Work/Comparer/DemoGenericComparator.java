/*
   Demonstrate Generics (type is indicated by T)
 */

package demogenericcomparator;

/**
 *
 * @author kmoore
 */
public class DemoGenericComparator {

    public static void main(String[] args) {
        Integer x = new Integer(9);
        Integer y = new Integer(12);
        Comparer<Integer> comp = new Comparer<Integer>();
        System.out.println("The larger of " + x + " and " + y + " is " + comp.compare(x,y));
        Comparer<Double> comp2 = new Comparer<Double>();
        Double p = new Double(14.0);
        Double q = new Double(1);
        System.out.println("The larger of " + p + " and " + q + " is " + comp2.compare(p,q));
        ComparerNum<Double,Integer> comp3 = new ComparerNum<Double,Integer>();
        System.out.println("Comparing " + p + " and " + y);
        if(comp3.comparer(p,y) == 1)
            System.out.println(" greater " + p);
        else
            System.out.println(" greater " + y);
        
        // this compiles because String extends Comparable
        Comparer<String> comps = new Comparer<String>();
        
        // will not compile because string does not extend Number
        //ComparerNum<String,String> comps2 = new ComparerNum<String,String>();
        
    }
    
}
