/*
 Class that shows static methods and variables.
 */

package statics;

/**
 *
 * @author lhawk20
 */
public class ShowStatics {
    // a separate A will be created for each object
    private int a;
    
    
    // stored in static or shared memeory
    
    static int count = 0;
    
    // constructors
    ShowStatics(){
        a = 0;
        count++;
    }
    
    ShowStatics(int pa){
        a = pa;
        count++;
    }
    
    // mutator
    public void setA(int pa){
        a = pa;
    }
    
    // accessor
    public int getA(){
        return a;
    }
    
    public String toString(){
        return " a = " + a + " count = " + count;
    }
    
    // requires an instance of ShowStatics to be used.
    public String output(String s){
        return s + " a = " + a + " count = " + count;
    }
    
    // can be used without instantiating (new keyword) ShowStatics
    public static String countOut(){
        return " count " + count;
    }
    
    public boolean equals(ShowStatics ss){
        return getA() == ss.getA();
    }
}
