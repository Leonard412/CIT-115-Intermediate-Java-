package adt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Fraction {
    
    int numerator;
    int denominator;


    
    public Fraction(){
        int numerator = 0;
        int denominator = 0;
    }
    
     public Fraction(int num, int den){
        numerator = num;
        denominator = den;
        
        if(den == 0){
            throw new IllegalArgumentException(
            "Denominator cannot be zero");
        }
    }
  
            
    public void setNum(int n){
        numerator = n;
    }
    
    public int getNum(){
        return numerator;   
    }
        
    public void setDem(int d){
        denominator = d;
    }
    
    public int getDem(){
        return denominator;
    }
     
    @Override
    public String toString(){
        return "["+ numerator + "," + denominator + "]";
    }
    
    public boolean equals(Fraction f){
        return getNum() * f.getDem() == f.getNum() *getDem();
       
    
    }
    
    

}