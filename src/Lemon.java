/**
 * Lemon class. Lemon is a subclass of Additive.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
public class Lemon extends Additive {

    private String name = "Lemon";
    
    /**
     * Creates a Lemon object.
     * Lemon uses its parent constructor and sets its own name.
     */
    public Lemon() {
        super();
        this.setName(name);
    }//end constructor
    
}//end Lemon