/*
Leonard Hawkes
CIT 130
2/20/2015
Design a console simulated graphics system.
 */

package figure;

public class Circle extends Figure {
    int radius, placement;
 
public Circle(){
    super(0,0,"none");
    setPlacement(0);
    setRadius(0);
 }
 
   public Circle(String n, int p, int r){
    super(p,r,n);
    setPlacement(p);
    setRadius(r);
    
    }
 
    public String toString(){
    return "In Circle Drawing "+getName()+" centered at ("+getX()+","+getY()+")"
            + " radius " + getRadius() + " placement " + getPlacement();

    }
    
    public void erase(){
    System.out.println("In Circle erasing");
    }
 
    public void draw(){
    center();
    erase();
    System.out.println(""+this);
    }
    
    private void setPlacement(int p){
        placement = p;
    }
    
    private void setRadius(int r){
        radius = r;
    }
    
    public int getPlacement(){
        return placement;
    }
    
    public int getRadius(){
        return radius;
    }

    

    
}
