/**
 * Lobster Bisque class. The class is a subclass of Soup.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
public class LobsterBisque extends Soup {
    
    private String name = "Lobster Bisque";

    /**
     * Creates a Lobster Bisque object.
     * The object uses it's parent constructor (Soup) and sets its own name.
     */
    public LobsterBisque() {
    	super();
        this.setName(name);
    }//end constructor
    
    //Overrides the Soup's list of types
    //Lobster Bisque has no subtypes
    protected void fillTypes() {
        this.types = null;
    }//end fillTypes
    
}//end LobsterBisque