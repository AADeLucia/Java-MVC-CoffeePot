/**
 * Peppermint Hot Chocolate class. Peppermint Hot Chocolate is a subclass
 * of Hot Chocolate.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */

public class PeppermintHotChocolate extends HotChocolate {
    
    private String name = "Peppermint Hot Chocolate";

    /**
     * Creates a Peppermint Hot Chocolate object.
     * Peppermint Hot Chocolate uses its parent constructor (Hot Chocolate)
     * and sets its own name and price.
     */
    public PeppermintHotChocolate() {
        super();
        this.setName(this.name);
    }//end constructor
    
    //Overrides Hot Chocolate's available types
    //Peppermint Hot Chocolate has no types
    protected void fillTypes() {
        this.types = null;
    }//end fillTypes

}//end PeppermintHotChocolate