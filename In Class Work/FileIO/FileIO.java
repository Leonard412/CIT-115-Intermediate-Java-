/*
 Text and binary Input/Output (I/O)
 */

package fileio;
import java.io.*;

public class FileIO {


    public static void main(String[] args) {
        try{
        PrintWriter out = new PrintWriter(new FileOutputStream("leonard.txt"));
    }catch(FileNotFoundException e){
        System.out.println("FILE NOT FOUND " + e);
    }
    
    }
}
