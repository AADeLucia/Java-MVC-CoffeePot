/**
 * Chamomile Tea is a subtype of Tea.
 * @author Alexandra DeLucia
 *
 */

public class ChamomileTea extends Tea {
	private String name = "Chamomile Tea";

	/**
	 * Creates a Chamomile Tea object.
	 * Chamomile uses its parent constructor and sets its own name.
	 */
	public ChamomileTea() {
		super();
		this.setName(name);
	}//end constructor

	//Overrides Coffee's array of types
	//Chamomile has no subtypes
	protected void fillTypes() {
		this.types = null;
	}//end fillTypes
}
