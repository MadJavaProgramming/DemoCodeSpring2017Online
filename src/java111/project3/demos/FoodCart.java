/** Foodcart represents a mobile to-go food vendor
 * 
 * @author pwaite
 */
 
 public class FoodCart extends Restaurant {
 
     private String mobileLocation;
	/**
	 * Returns the value of mobileLocation.
	 * @return the mobile location of the restaurant
	 */
	public String getMobileLocation() {
		return mobileLocation;
	}


	/**
	 * Sets the value of mobileLocation.
	 * @param mobileLocation The value to assign mobileLocation.
	 */
	public void setMobileLocation(String mobileLocation) {
		this.mobileLocation = mobileLocation;
	}

	/** displays the name, type and rating for the restaurant
      */
    public void display() {
        super.display();
        System.out.println("Today the food cart is at: " +  mobileLocation);
        System.out.println();
     } 
 
 }
