/**
 * Hot Chocolate class. Hot Chocolate is a subclass of Beverage.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
import java.util.ArrayList;

public class HotChocolate extends Beverage {
    
    private String name = "Hot Chocolate";
    private int price = 100;

    /**
     * Creates a Hot Chocolate object.
     * Hot Chocolate uses its parent constructor (Beverage) and sets its own name and
     * price.
     */
    public HotChocolate() {
        super();
        this.setName(this.name);
        this.setPrice(this.price);
    }//end constructor
    
    //Overrides beverage's fillTypes method
    protected void fillTypes() {
        this.types = new ArrayList<Beverage>();
        	this.types.add(new OriginalHotChocolate());
            this.types.add(new PeppermintHotChocolate());
    }//end fillTypes
    
    //Overrides Beverage's available additives
    //Hot Chocolate can have marshmallows
    protected void fillAdditives() {
        this.additives = new ArrayList<Additive>();
            this.additives.add(new Marshmallow());
    }//end fillAdditives

}//end HotChocolate