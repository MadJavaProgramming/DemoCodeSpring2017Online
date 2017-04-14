/** A fastfood restaurant
 *  @author pwaite
 */

 public class FastFood extends Restaurant {
 
     private boolean kidsPlayArea;


	/**

	 * Returns the value of kidsPlayArea.

	 * @return indicator whether or not the establishment has a kid's play area.
	 */

	public boolean getKidsPlayArea() {

		return kidsPlayArea;

	}



	/**

	 * Sets the value of kidsPlayArea.

	 * @param kidsPlayArea The value to assign kidsPlayArea.

	 */

	public void setKidsPlayArea(boolean kidsPlayArea) {

		this.kidsPlayArea = kidsPlayArea;

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


	/** provides a string representation of a FastFood restaurant
	 * @return all values related to the FastFood restaurant 
      */
        public String toString() {
         
            return super.toString() + 
                    " and has a kid's play area: " + kidsPlayArea;
         }

        
 }
