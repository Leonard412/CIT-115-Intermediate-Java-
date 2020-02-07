/*

    Compare utilizing the numeric value of the parameter.
    We insure the ability to get the numeric value by specifying
    extends Number.  Number enforces a doubleValue method.

 */

package demogenericcomparator;

/**
 *
 * @author kmoore
 */
public class ComparerNum<T extends Number, U extends Number> {

    // return 1 if a is greater return 2 if b is greater
    public int comparer(T a, U b){
        int x = 0;
        if(a.doubleValue() > b.doubleValue())
            x = 1;
        else 
            x = 2;
        return x;
    }
    
}
