/**
 * Decaf class. Decaf is a subclass of Coffee.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */

public class Decaf extends Coffee {
    
    private String name = "Decaf Coffee";
    
    /**
     * Creates a Decaf object.
     * Decaf uses its parent constructor and sets its own name.
     */
    public Decaf() {
        super();
        this.setName(name);
    }//end constructor
    
    //Overrides Coffee's array of types
    //Decaf has no subtypes
    protected void fillTypes() {
        this.types = null;
    }//end fillTypes
    
}//end Decaf