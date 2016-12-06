/**
 * Creamer class. Creamer is a subclass of Additive.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
public class Creamer extends Additive {
    
    private String name = "Creamer";
    
    /**
     * Creates a Creamer object.
     * Creamer uses its parent constructor and sets its own name.
     */
    public Creamer() {
        super();
        this.setName(name);
    }
    
}//end Creamer