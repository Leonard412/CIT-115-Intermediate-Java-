/*

 */

package arraylistdemo;

import java.util.*;
import static java.util.Collections.*;

public class ArrayListDemo {


    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(new Integer(1));
        a.add(new Integer(-2));
        sort(a);
        System.out.println("for each example");
        for(Integer z:a) // places everything in a into z and prints it
            System.out.println(" " + z);
        Iterator i = a.iterator();
        System.out.println("Iterator example");
        while(i.hasNext()){
            System.out.println(" " + i.next());
        }
    }
    
}
