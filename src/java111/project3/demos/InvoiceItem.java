/** Represents a single item on an invoice -  project 2 
 * 
 *  @author pwaite
**/
public class InvoiceItem {

    private double price;
    private int quantity;

	/**
	 * Sets the value of price.
	 * @param price The value to assign price.
	 */
	public void setPrice(double price) {
		this.price = price;
	}



	/**
	 * Sets the value of quantity.
	 * @param quantity The value to assign quantity.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/** Calculates the total line item
	 *  @return line item total
	 */
	 public double calculateTotal() {
	     return price * quantity;
	 }

    
}

