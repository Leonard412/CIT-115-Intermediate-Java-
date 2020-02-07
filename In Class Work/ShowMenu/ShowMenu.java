
package showmenu;

/**
 *
 * A program that shows inheritance, abstraction and polymorphism.
 * <h2 Style="color:#800">Another Amazing Demo Program</h2>
 * <h3 Style="color:#00F">Ken Moore</h2>
 * 
 * @author kmoore
 * @version 1.0
 * @since 9/29/2014
 */
public class ShowMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Food [] f = new Food[10];

        // can not compile the following line!
        //Food aFood = new Food();
        Chicken c1 = new Chicken("Chicken in Wine Sauce");
        Chicken c2 = new Chicken("Chicken in White Sauce");
        Fish f1 = new Fish();
        Fish f2 = new Fish("Catch of the day Flounder");
        f1.setName("Fish");
        f1.setDesc("Catch of the day Salmon");

        // output without polymorphism
        //System.out.println(c1);
        //System.out.println(c2);
        //System.out.println(f1);
        //System.out.println(f2);
        
        // put derived objects into a base class array
        f[0] = f1;
        f[1] = c2;
        f[2] = f2;
        f[3] = c1;

        //output using polymorphism
        for(int i = 0; i < 4; i++)
            System.out.println("\n" + f[i]);
    }
    
}
