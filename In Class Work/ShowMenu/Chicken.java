/**
 *
 * @author kmoore
 */
public class Chicken extends Food {
    
    // state variable to hold a description
    public String desc;
    
    public Chicken(){
        // by convention always call super in a derived class construtor
        super();
        desc = "UNSPECIFIED";
    }
    
    public Chicken(String d){
        super("Chicken");
        setDesc(d);
    }
    
    public String getDesc(){return desc;}
    public void setDesc(String d){desc = d;}
    
    
    public String toString(){
        return "Meat: " + getName() + "\nDescription " + getDesc();
    }
}
