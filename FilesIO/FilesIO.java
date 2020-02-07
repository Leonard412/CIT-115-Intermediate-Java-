/*
Leonard Hawkes
3/1/2015
Write a program that reads and writes from binary or text files.
 */

package filesio;

import java.io.*;
import java.util.*;

public class FilesIO {


    public static void main(String[] args) throws Exception {
        
        
        boolean cont = true;
        boolean correct = true;
        String fileName;
        String fileType;
        String correctChoice;
        String nextLine = "y";
        String text;
        PrintWriter textOut = null;
        ObjectOutputStream binaryOut = null;
        ObjectInputStream binaryIn = null;
        TextFiles mto = null;
        BinaryFiles mbo = null;
        
        Scanner userConsoleInput = new Scanner(System.in);
        
        while(cont){
            System.out.println("Please enter the file name: ");
            fileName = userConsoleInput.next();
            userConsoleInput.nextLine();
            System.out.println("Binary or text file? (b/t)");
            fileType = userConsoleInput.next();
            
         if(fileType.equalsIgnoreCase("t"))
            {

                while(correct)
                {
                    System.out.println("Do you wish to read from, or write to a file?(r/w): ");
                    correctChoice = userConsoleInput.next();


                    if(correctChoice.equalsIgnoreCase("w"))
                    {
                        mto = new TextFiles(fileName);
                        try {
                            textOut = mto.createOutputTextFile();
                        } catch (FileNotFoundException ex) {
                            System.out.println("Error creating file");
                        }
                            while(nextLine.equalsIgnoreCase("y"))
                            {
                                userConsoleInput.nextLine();
                                System.out.print("Enter a line of text: ");
                                text = userConsoleInput.next();
                                System.out.println(text);
                                textOut.println(text);
                                System.out.print("Would you like to enter another"
                                        + " line?(y/n): ");
                                nextLine = userConsoleInput.next();
                        }
                            textOut.close();
                            userConsoleInput.nextLine();
                            System.out.println("Do you wish to do another action?(y/n): ");
                            if(userConsoleInput.next().equalsIgnoreCase("n"))
                                cont = false;
                    }
                    
                else if(correctChoice.equalsIgnoreCase("r"))
                    {
                        Scanner textRead = null;
                        try {
                             textRead =  new Scanner(new FileInputStream(fileName+".txt"));

                            } 

                        catch (FileNotFoundException ex) {
                                System.out.println(ex.getMessage());
                         }
                        finally{
                            while(textRead.hasNextLine())
                                System.out.println(textRead.nextLine());
                        }
                        System.out.println("Do you wish to do another action?(y/n): ");
                            if(userConsoleInput.next().equalsIgnoreCase("n"))
                            cont = false;

                    }

                    else
                        System.out.print("That is not a valid choice, try again.");
                        correct = false;

                }    

            }
            else if(fileType.equalsIgnoreCase("b"))
            {

                while(correct)
                {
                    System.out.println("Do you wish to read from, or write to a file?(r/w): ");
                    correctChoice = userConsoleInput.next();
                    if(correctChoice.equalsIgnoreCase("w"))
                    {
                        mbo = new BinaryFiles(fileName);
                        binaryOut = mbo.createBinaryOutputFile();
                        userConsoleInput.nextLine();
                        System.out.println("Do you wish to do another action?(y/n): ");
                        if(userConsoleInput.next().equalsIgnoreCase("n"))
                            cont = false;    
                    }
                    else if(correctChoice.equalsIgnoreCase("r"))
                    {
                        try {  
                            binaryIn = mbo.createBinaryInputFile();
                            try{

                            while(true)
                               {
                                    System.out.println(binaryIn.readUTF());
                                    binaryIn.close();
                               }
                        }catch(EOFException e){
                        }
                        catch(FileNotFoundException ex){
                            System.out.println(ex.getMessage());
                        }
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println("Do you wish to do another action?(y/n): ");
                        if(userConsoleInput.next().equalsIgnoreCase("n"))
                            cont = false;
                    }
                    else
                        System.out.print("That is not a valid choice, try again.");
                        correct = false;
                }    

            }
            else
                System.out.println("That is not a valid choice.");


         }   

                    

        }


}    
    
   
