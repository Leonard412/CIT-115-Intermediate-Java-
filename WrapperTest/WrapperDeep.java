/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wrappertest;


public class WrapperDeep {
    private int [] a = new int [3];
    public WrapperDeep(WrapperDeep ws){
    a = new int[3];
    for(int i = 0; i < 3; i++)
    a[i]=ws.a[i];
    
    
    }
    
    public WrapperDeep(){
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        
    }
     
    public void setArray(){
        a[0] = 7;
        a[1] = 17;
        a[2] = 77;
    }
    
    public int[] getArray() {
        return a;
    }
    
    @Override
     public String toString(){
         return a[0] + " " + a[1] + " " + a[2];
     }
     
    @Override
      public boolean equals(Object obj) {
        if (obj == null)
            return false;        
        else if(getClass() != obj.getClass()) 
            return false;        
        else {
            WrapperDeep otherDeep = (WrapperDeep) obj;
            return getArray() == otherDeep.getArray();
        }        
    }

    
}
