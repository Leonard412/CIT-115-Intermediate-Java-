/*
Leonard Hawkes
CIT 130
2/20/2015
Design a console simulated graphics system.
 */

package figure;

/**
 *
 * @author lhawk20
 */
public class Rectangle extends Figure {
    int width,height;
    
    public Rectangle(){
    super(0,0,"none");
    setWidth(0);
    setHeight(0);
 }
 
   public Rectangle(String n, int a, int b){
    super(a,b,n);
    setWidth(a);
    setHeight(b);
    }
 
    public String toString(){
    return "In Rectangle Drawing "+getName()+" centered at ("+getX()+","
            +getY() + ") width "+getWidth()+" height "+getHeight();


    }
    
    public void erase(){
    System.out.println("In Rectangle erasing");
    }
 
    public void draw(){
    center();
    erase();
    System.out.println(""+this);
    }
    
    public void setWidth(int w){width = w;}
    public void setHeight(int h){height = h;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}

    
}
