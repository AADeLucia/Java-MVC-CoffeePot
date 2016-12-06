/**
 * Coin class.
 * Coin types that can be used in the Bank.
 * 
 * @author Arden Baxter
 * @author Alexandra DeLucia
 * @author Nora Karsten
 */
 
public enum Coin {
  NICKEL(5),
  DIME(10),
  QUARTER(25);
  
  private final int value;
  
  private Coin(int v) {
    this.value = v;
  }//end Constructor
  
  /**
   * Returns the value of the Coin.
   * Each coin is associated with its respective value. For example, a quarter
   * is worth 25.
   * @return value of coin
   */
  public int value(){
    return this.value;
  }//end value
  
}//end Coin