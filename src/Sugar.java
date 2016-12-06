/**
 * Sugar class. Sugar is a subclass of Additive.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
public class Sugar extends Additive {
    
    private String name = "Sugar";
    
    /**
     * Creates a Sugar object.
     * Sugar uses its parent constructor and sets its own name.
     */
    public Sugar() {
        super();
        this.setName(name);
    }//end constructor
    
}//end Sugar