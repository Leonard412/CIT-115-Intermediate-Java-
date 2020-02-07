/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wrappertest;
import java.util.*;


public class WrapperShallow {
    Scanner input = new Scanner(System.in);
    private int [] a = new int[3];
    
    public WrapperShallow(){
        a[0] = 7;
        a[1] = 17;
        a[2] = 77;
    }
    
    public WrapperShallow(WrapperShallow ws){
        a = ws.a;
    }
    
    public void setArray(){
        a[0] = 13;
        a[1] = 14;
        a[2] = 15;
    }
    
    public int[] getArray() {
        return a;
    }
    
    @Override
    public String toString(){
         return a[0] + " " + a[1] + " " + a[2];
     }
    
     public boolean equals(Object obj) {
        if (obj == null)
            return false;        
        else if(getClass() != obj.getClass()) 
            return false;        
        else {
            WrapperShallow otherShallow = (WrapperShallow) obj;
            return getArray() == otherShallow.getArray();
        }        
    }
    
}
