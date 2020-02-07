/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filesio;

import java.io.*;

public class TextFiles extends java.lang.Exception{
    private String fname = "";
    
    public TextFiles(){
        
    }
    
    public TextFiles(String f){
        super("File does not exist");
        fname = f;
    }
    
    public PrintWriter createOutputTextFile() throws Exception{
    	PrintWriter textOut = null;
    	try{
    	  
    	   textOut = new PrintWriter(new FileOutputStream(fname+".txt",true)); 
    	}
    	catch (FileNotFoundException e){
    		System.out.println(e);
    		throw new Exception("The file could not be created.");
    	}
    	return textOut;
    }
    
    public String getFname(){
    	return fname;
    }
    public void setFname(String f){
    	fname = f;
    }
}
