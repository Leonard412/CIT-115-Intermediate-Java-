/*
Leonard Hawkes
CIT 130
2/20/2015
Design a console simulated graphics system.
 */

package figure;

public class DemoTest {


    public static void main(String[] args) {

        Figure [] geometry = new Figure[6];
        
        Circle c1 = new Circle("c1",33,70);
        Circle c2 = new Circle("c2",5,10);
        Circle c3 = new Circle("c3", 110,200);
        Rectangle r1 = new Rectangle("r1", 50, 100);
        Rectangle r2 = new Rectangle("r2", 80, 120);
        Rectangle r3 = new Rectangle("r3", 25, 100);
        
        geometry[0] = c1;
        geometry[1] = c2;
        geometry[2] = c3;
        geometry[3] = r1;
        geometry[4] = r2;
        geometry[5] = r3;
        
        
        try{
        for(int i = 0;i < Figure.getNumberOfShapes(); i++){
            geometry[i].draw(); // for loop kept making NullPointerException
        
            }
        }
        catch(Exception e){
                
        }
    
    }
}
