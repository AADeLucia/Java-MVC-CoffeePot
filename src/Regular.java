/**
 * Regular class. Regular is a subclass of Coffee.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */

public class Regular extends Coffee {
    
    private String name = "Regular Coffee";
    
    /**
     * Creates a Regular object.
     * Regular uses its parent constructor and sets its own name.
     */
    public Regular() {
        super();
        this.setName(name);
    }//end constructor
    
    //Overrides Coffee's array of types
    //Regular has no subtypes
    protected void fillTypes() {
        this.types = null;
    }//end fillTypes
    
}//end Regular