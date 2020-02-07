/*

    This comparer (utilizing the method compareTo which is required if 
    a non-abstract class extends Comparable)
    In this example only one type is allowed.

 */

package demogenericcomparator;

/**
 *
 * @author kmoore
 */
public class Comparer<T extends Comparable> {
    
    public T compare(T a, T b){
        T x = null;
        if(a.compareTo(b) > 0){
            x = a;
        }
        else{
            x = b;
        }
        return x; 
    }
 
}
