/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filesio;

import java.io.*;

/**
 *
 * @author lhawk20
 */
public class BinaryFiles extends java.lang.Exception{
    private String fname = "";
    
    public BinaryFiles(){
        
    }
    
    public BinaryFiles(String f){
        super("File does not exist");
        fname = f;
    }
    
    public ObjectOutputStream createBinaryOutputFile(){
        ObjectOutputStream oos = null;
        try{
    	   // put ObjectOutputStream pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   oos = new ObjectOutputStream(new FileOutputStream(fname+".bin",false)); 
    	}
    	catch (IOException e){
    		System.out.println(e);
    	}
    	return oos;
    }
    
    public ObjectInputStream createBinaryInputFile() throws Exception{
    	ObjectInputStream ois = null;
    	try{
    	   // put ObjectOutputStream pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   ois = new ObjectInputStream(new FileInputStream(fname+".bin")); 
    	}
    	catch (IOException e){
    		System.out.println(e);
    		throw new Exception("The file could not be created.");
    	}
    	return ois;
    }
    
    public String getFname(){
    	return fname;
    }
    public void setFname(String f){
    	fname = f;
    }    
}
