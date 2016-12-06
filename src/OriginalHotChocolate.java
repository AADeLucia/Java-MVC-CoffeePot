/**
 * Original Hot Chocolate class. Original Hot Chocolate is a subclass
 * of Hot Chocolate.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */

public class OriginalHotChocolate extends HotChocolate {
    
    private String name = "Original Hot Chocolate";

    /**
     * Creates a Original Hot Chocolate object.
     * Original Hot Chocolate uses its parent constructor (Hot Chocolate)
     * and sets its own name and price.
     */
    public OriginalHotChocolate() {
        super();
        this.setName(this.name);
    }//end constructor
    
    //Overrides Hot Chocolate's available types
    //Original Hot Chocolate has no types
    protected void fillTypes() {
        this.types = null;
    }//end fillTypes

}//end PeppermintHotChocolate