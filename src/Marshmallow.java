/**
 * Marshmallow class. Marshmallow is a subclass of Additive.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
public class Marshmallow extends Additive {
    
    private String name = "Marshmallows";
    
    /**
     * Creates a Marshmallow object.
     * Marshmallow uses its parent constructor and sets its own name.
     */
    public Marshmallow() {
        super();
        this.setName(name);
    }//end constructor
    
}//end Marshmallow