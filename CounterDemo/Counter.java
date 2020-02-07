/*
 Leonard Hawkes
 CIT 130
 Programming Assignment 2
 1/19/2015

Write a counter class in its own file. This will allow your 
counter to be used by any program
The counter must be able to increment and decrement by one. 
It must never go below zero. toString and equals must be implemented and
tested correctly. (toString and equals are covered in depth in your text) 
System.out.println("”+c1) must work and if(c1.equals(c2)) must work
where c1 and c2 are instances of your counter. Include an 
override of the default constructor that sets the counter to zero 
and a constructor that allows you to set the count.
 */


 
   

package counterdemo;

/**
 *
 * @author lhawk20
 */
public class Counter {
    
    private int count;
    
    public Counter(){
        count = 0;
    }
    
    public void addCount(){
        count++;
    }
    
    public void minusCount(){
        count--;
        if(count >= 0){

            
        }
        else{
          System.out.println("Error! Attempted to decrement a "
          + "value of 0.");
        }
    }
    
    public Counter(int newCount){
        count = newCount;
    }
    
    public int getCount(){
        return count;
    }
    
    @Override
    public String toString(){
        return " current count is " + count;
    }
    
    public boolean equals(Counter c){
        return this.getCount() == c.getCount();
    }
    

    
    }
    
