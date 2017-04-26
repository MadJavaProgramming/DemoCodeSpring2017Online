package java111.project5.demos;

/** Foodcart represents a mobile to-go food vendor
 * 
 * @author pwaite
 */
 
 public class FoodCart extends Restaurant {
 
     private String mobileLocation;
     
     public FoodCart(){
        System.out.println("In the FoodCart constructor");
    }

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

	/**  iterate over the menu item, creating a string containing the menu
    * @return String menu - list of menu items
    */
    public String displayMenu() {
        int counter = 0;
        String menuString  = "";
        for (MenuItem item : getMenu()){
            menuString = menuString + item.getName() + " ";  
            counter++;
        }
        return menuString;
     }
     
     

	/** Returns a string representing a FoodCart
	  * @return the string representation of FoodCart.
      */
    public String toString() {
        return super.toString() + "Today the food cart is at: " +  mobileLocation;
     } 
 
 }
