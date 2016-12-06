/**
 * Chicken Bouillon class. The class is a subclass of Soup.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
public class ChickenBouillon extends Soup {
    
    private String name = "Chicken Bouillon";

    /**
     * Creates a Chicken Bouillon object.
     * The object uses it's parent constructor (Soup) and sets its own name.
     */
    public ChickenBouillon() {
    	super();
        this.setName(name);
    }//end constructor
    
    //Overrides the Soup's list of types
    //Chicken Bouillon has no subtypes
    protected void fillTypes() {
        this.types = null;
    }//end fillTypes
    
}//end ChickenBouillon