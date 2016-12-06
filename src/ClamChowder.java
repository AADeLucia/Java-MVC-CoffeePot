/**
 * Clam Chowder class. The class is a subclass of Soup.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
public class ClamChowder extends Soup{
	
	private String name = "Clam Chowder";
    
    /**
     * Creates a Clam Chowder object.
     * The object uses it's parent constructor (Soup) and sets its own name.
     */
    public ClamChowder() {
    	super();
        this.setName(name);
    }//end constructor
    
    //Overrides the Soup's list of types
    //Clam Chowder has no subtypes
    protected void fillTypes() {
        this.types = null;
    }//end fillTypes

}//end ClamChowder
