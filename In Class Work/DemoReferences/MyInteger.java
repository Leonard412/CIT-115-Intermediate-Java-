/*
Stores an int
 */

package demoreferences;

/**
 *
 * @author lhawk20
 */
public class MyInteger {
    
    
    // object Integer
    public Integer myInteger;
    
    MyInteger() {myInteger = new Integer(0);}
    MyInteger(int i){myInteger = new Integer(i);}
    // copy constructor
    MyInteger(MyInteger mi){myInteger = mi.myInteger;}
    public void setI(int i){myInteger = new Integer(i);}
    public int getI(){return myInteger;}
    public String toString() {return "i = " + myInteger;}
        
    
}
