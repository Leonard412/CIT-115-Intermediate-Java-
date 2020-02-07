
package showmenu;

/**
 * Base class for Menu Items
 * @author kmoore
 */

public abstract class Food {

    // single state variable
    private String name;
    
    /**
     * Default constructor
     */
    public Food(){name = "DEFAULT";}
    
    /**
     * Overload constructor
     * @param n name
     */
    public Food(String n){setName(n);}
    
    /**
     * State Mutator
     * @param n name
     */
    public void setName(String n){name = n;}
    
    /**
     * State Accessor
     * @return name 
     */
    public String getName(){return name;}
    
    /**
     * Abstract method making the class abstract and forcing
     * all child classes to implement toString
     * 
     * @return 
     */
    public abstract String toString();
}
