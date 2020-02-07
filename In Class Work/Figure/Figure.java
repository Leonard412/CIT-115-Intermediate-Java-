/*
Design a console simulated graphics system.
 */

package figure;


public abstract class Figure {

    private int x, y;
    private String name;
    private static int numberOfShapes = 0;
    
    public Figure(){
        x = 0;
        y = 0;
        name = "none";
    }
    
    public Figure(int a, int b, String n){
        setX(a);
        setY(b);
        setName(n);
        numberOfShapes++;
        
        
    }
    
    public void setX(int a){x = a;}
    public void setY(int b){y = b;}
    public void setName(String n){name = n;}
    public int getX(){return x;}
    public int getY(){return y;}
    public String getName(){return name;}
    public static int getNumberOfShapes(){return numberOfShapes;}
    public abstract void erase();
    public abstract void draw();
    public void center(){
        System.out.println("\nIn Figure. Centering at ("+getX()+","+getY()+")");
    }



    
}
