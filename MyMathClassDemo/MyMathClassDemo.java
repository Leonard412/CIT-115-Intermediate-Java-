/*

 */

package mymathclassdemo;

import java.util.*;


public class MyMathClassDemo extends MyMathClass {


    public static void main(String[] args) {
        double stdDev = 0;
		
	ArrayList<Double> doubArrayList = new ArrayList<Double>();
	doubArrayList.add(new Double(1.0));
	doubArrayList.add(new Double(2.0));
	doubArrayList.add(new Double(3.0));
	doubArrayList.add(new Double(4.0));
	doubArrayList.add(new Double(5.0));
	doubArrayList.add(new Double(6.0));
	doubArrayList.add(new Double(7.0));
	doubArrayList.add(new Double(8.0));
	doubArrayList.add(new Double(9.0));
	doubArrayList.add(new Double(10.0));
	
	MyMathClass<Double> myDouble = new MyMathClass<Double>();
	stdDev = myDouble.standardDeviation(doubArrayList);
	System.out.println("The standard deviation of the Double ArrayList is " + stdDev);
	
	ArrayList<Integer> intArrayList = new ArrayList<Integer>();
	intArrayList.add(new Integer(1));
	intArrayList.add(new Integer(3));
	intArrayList.add(new Integer(3));
	intArrayList.add(new Integer(4));
	intArrayList.add(new Integer(4));
	intArrayList.add(new Integer(6));
	intArrayList.add(new Integer(7));
	intArrayList.add(new Integer(8));
	intArrayList.add(new Integer(9));
	intArrayList.add(new Integer(10));
		
	MyMathClass<Integer> myInteger = new MyMathClass<Integer>();
	stdDev = myInteger.standardDeviation(intArrayList);
	System.out.println("The standard deviation of the Integer ArrayList is " + stdDev);
		
    }
    
}
