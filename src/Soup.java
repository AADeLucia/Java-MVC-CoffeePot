/**
 * Soup class. Soup is a subclass of Beverage.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
import java.util.ArrayList;

public class Soup extends Beverage {
    
    private String name = "Soup";
    private int price = 80;

    /**
     * Creates a Soup object.
     * Soup uses its parent constructor (Beverage) and sets its own name and
     * price.
     */
    public Soup() {
        super();
        this.setName(name);
        this.setPrice(price);
    }//end constructor
    
    //Overrides beverage's fillTypes method
    protected void fillTypes() {
        this.types = new ArrayList<Beverage>();
            this.types.add(new ChickenBouillon());
            this.types.add(new ClamChowder());
            this.types.add(new LobsterBisque());
    }//fillTypes

}//end Soup