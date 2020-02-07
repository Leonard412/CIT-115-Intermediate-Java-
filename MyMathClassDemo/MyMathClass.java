/*

 */

package mymathclassdemo;

import java.util.*;


public class MyMathClass<T extends Number>{
    double average = 0;
    private double standardDeviation = 0;
    
    public MyMathClass()
    {
		
    }
    
    public double standardDeviation(ArrayList<T> alist){
	for (T element : alist){
            average = (average + element.doubleValue()); //add
	}
	average = (average / alist.size()); //divide to get avg
        
        //System.out.println("The average is:" + average); //Test to make sure average is correct
		
        for (T element : alist){
	//double elem = element.doubleValue();
	standardDeviation = (standardDeviation + Math.pow((element.doubleValue() - average), 2)); //add
	}
	standardDeviation = standardDeviation / (alist.size()-1); //divide to get avg
	standardDeviation = Math.pow(standardDeviation, 0.5); //sqrt to get stdDev
	return standardDeviation;
	}
    
}
