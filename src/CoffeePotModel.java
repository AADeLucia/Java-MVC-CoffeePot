/**
 * Simulates a CoffeePot that collects money and dispenses Beverages.
 * Does not include a main or a GUI.
 * Based upon the group project from CMS 270
 * 
 * @author Alexandra DeLucia
 */

import java.text.NumberFormat;
import java.util.ArrayList;

public class CoffeePotModel {
	private Bank bank;
	private BeverageFactory factory;
	private Beverage orderedBeverage = null;
	private ArrayList<Additive> orderedAdditives = null;
	NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
	boolean beverageIsDispensed = false;
	
	/**
	 * Creates a CoffeePotModel with a Bank and a Beverage Factory.
	 * @param bank
	 * @param factory
	 */
	public CoffeePotModel(Bank bank, BeverageFactory factory) {
		this.bank = bank;
		this.factory = factory;
	}
	
	/**
	 * Returns a list of available Beverages.
	 * The list is generated from the Beverage Factory.
	 * @return list of available Beverages
	 */
	public ArrayList<Beverage> getBeverageList() {
		return factory.getBeverageList();
	}
	
	/**
	 * Returns the currently ordered Beverage.
	 * @return ordered Beverage
	 */
	public Beverage getOrderedBeverage() {
		return orderedBeverage;
	}
	
	/**
	 * Sets the ordered Beverage.
	 * @param Beverage
	 */
	public void setOrderedBeverage(Beverage bev) {
		orderedBeverage = bev;
	}
	
	/**
	 * Adds an additive to the list of ordered additives.
	 * The ordered additives are used to create the Beverage.
	 * @param additive
	 */
	public void addToOrderedAdditives(Additive additive) {
		if(orderedAdditives == null)
			orderedAdditives = new ArrayList<Additive>();
		if(!orderedAdditives.contains(additive)) orderedAdditives.add(additive);
	}
	
	/**
	 * Collects payment for the Beverage.
	 * The payment is added to the Bank, where it is kept track of.
	 * The payment is accepted in the form of a Coin enum.
	 * @param coin
	 */
	public void addToPayment(Coin coin) {
		bank.collectPayment(coin);
	}
	
	/**
	 * Returns change based on the ordered beverage.
	 * @return message with the change
	 */
	public String returnChange() {
		String output = "";
		if(bank.getPayment() == 0) output = "Please enter payment.";
		//Price is 0 because they did not buy anything
		else if(orderedBeverage == null || !beverageIsDispensed) output = bank.returnChange(0);
		else {
			//output = bank.returnChange(orderedBeverage.getPrice());
			output = bank.returnChange();
		}
		return output;
	}
	
	/**
	 * Resets the order.
	 */
	public void resetOrder() {
		setOrderedBeverage(null);
		orderedAdditives = null;
		beverageIsDispensed = false;
	}
	
	/**
	 * Returns a list of the available payment options.
	 * @return List of Coins
	 */
	public ArrayList<Coin> getAvailablePayment() {
		return bank.getCoinList();
	}
	
	/**
	 * Returns the current payment.
	 * @return String of payment
	 */
	public String getPayment() {
		return currencyFormatter.format(bank.getPayment()/100.0);
	}
	
	/**
	 * Returns a description of the current order.
	 * The order consists of the ordered beverage, ordered additives, and
	 * the total price.
	 * @return String of current order
	 */
	public String printOrder() {
		String output = "";
		output += "**Current Order**\n";
		if(orderedBeverage != null) {
			output += orderedBeverage.getName() + "\n";
			if(orderedAdditives != null) {
				for(int i = 0; i < orderedAdditives.size(); i++){
					output += "   + " + orderedAdditives.get(i).getName() + "\n";
				}
			}
		}
		output += "Total price: " + orderAmount() + "\n"
				+ "\nSelect Dispense to complete your order and Return Change for your change";
		
		return output;
	}
	
	/**
	 * Returns the total price of the order.
	 * @return String of the price
	 */
	public String orderAmount() {
		if(orderedBeverage == null) return "$0.00";
		else return currencyFormatter.format(orderedBeverage.getPrice()/100.0);
	}
	
	/**
	 * Returns a description of the preparation of dispensing the beverage.
	 * @return String of beverage dispensal
	 */
	public String dispenseBeverage() {
		String output = "";
		if(orderedBeverage != null) {
			if(bank.checkPayment(orderedBeverage.getPrice())) {
				output = factory.prepare(orderedBeverage, orderedAdditives) + "\nEnjoy your beverage!";
				beverageIsDispensed = true;
				bank.setPayment(bank.getPayment() - orderedBeverage.getPrice()); //subtract beverage price from payment
			}
			else {
				output = "Please enter enough change for your beverage";
			}
		}
		else
			output = "Please select a beverage";
		return output;
	}

	/**
	 * Returns a boolean value of whether an additive is in stock.
	 * @param additive
	 * @return Boolean
	 */
	public boolean isAvailable(Additive additive) {
		return factory.isAvailable(additive);
	}
	
	/**
	 * Returns true if the beverage has been dispensed
	 * @return Boolean
	 */
	public boolean beverageIsDispensed() {
		return beverageIsDispensed;
	}
	
}//end CoffeePotModel
