/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demoreferences;

/**
 *
 * @author lhawk20
 */
public class HoldI {
    MyInteger mi;
    HoldI(){mi = new MyInteger(0);}
    HoldI(int i){mi = new MyInteger(i);}
    HoldI(HoldI i){
        // WRONG! Shallow copy!
        //mi = 1.mi;
        // RIGHT! Deep copy!
        mi = new MyInteger(i.mi);
    }
    public void setI(int i ){mi.setI(i);}
    public String toString(){return " " + mi;}
    
}
