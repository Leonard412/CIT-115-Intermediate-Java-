/**
 * @(#)MyBinaryFileHandler.java
 *
 *
 * @author Kenneth Moore
 * @version 1.00 2010/2/8
  *
 * Assumes you create a MyBinaryFileHandler with a file name.
 * Allows you to create a new file for writing or open
 * an existing file for reading.
 *
 */
import java.io.*;

public class MyBinaryFileHandler extends java.lang.Exception {

    private String fname = "";

    public MyBinaryFileHandler() {
    }

    public MyBinaryFileHandler(String f) {
    	super("File Does Not Exist");    	
    	fname = f;
    }
    
    public ObjectOutputStream createBinaryOutputFile() throws MyException{
    	ObjectOutputStream oos = null;
    	try{
    	   // put ObjectOutputStream pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   oos = new ObjectOutputStream(new FileOutputStream(fname+".bin",false)); 
    	}
    	catch (IOException e){
    		System.out.println(e);
    		throw new MyException("The file could not be created.");
    	}
    	return oos;
    }
    public ObjectInputStream createBinaryInputFile() throws MyException{
    	ObjectInputStream ois = null;
    	try{
    	   // put ObjectOutputStream pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   ois = new ObjectInputStream(new FileInputStream(fname+".bin")); 
    	}
    	catch (IOException e){
    		System.out.println(e);
    		throw new MyException("The file could not be created.");
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