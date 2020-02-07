

package showmenu;

/**
 *
 * @author kmoore
 */
public class Fish extends Food{
    private String desc;
    
    public Fish(){
        super();
        desc = "UNSPECIFIED";
    }

    public Fish(String d){
        super("Fish");
        setDesc(d);
    }
    
    public void setDesc(String d){desc = d;}
    public String getDesc(){return desc;}

    public String toString(){
        return "Meat: " + getName() + "\nDescription " + getDesc();
    }
}
