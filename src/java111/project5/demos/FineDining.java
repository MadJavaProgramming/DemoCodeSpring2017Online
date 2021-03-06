package java111.project5.demos;

/** A fine dining establishment 
 *  @author pwaite
 */

 public class FineDining extends Restaurant {
 
     private boolean acceptsReservations;
     
     public FineDining(){
        System.out.println("In the FineDining constructor");
    }

	/**

	 * Returns the value of acceptsReservations.

	 * @return whether or not the restaurant accepts reservations
	 */

	public boolean getAcceptsReservations() {

		return acceptsReservations;

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



	/**

	 * Sets the value of acceptsReservations.

	 * @param acceptsReservations The value to assign acceptsReservations.

	 */

	public void setAcceptsReservations(boolean acceptsReservations) {

		this.acceptsReservations = acceptsReservations;

	}


	/** displays the address, name, rating and current location of the restaurant
	  * @return string represenation of a FineDining Restaurant
      */
        public String toString() {
         
            return super.toString() + 
                    " and takes reservations: " + acceptsReservations;
         }

        
 }
