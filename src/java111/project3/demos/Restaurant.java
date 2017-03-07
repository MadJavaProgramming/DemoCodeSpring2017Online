import java.util.*;

/** Represents a restaurant in a Yelp-like system
 *
 *  @author pwaite
 */
 
public class Restaurant {
    private String name;
    private String type;
    private int rating;
    private ArrayList<MenuItem> menu;

	/**

	 * Returns the value of menu.

	 * @return the array of menu items
	 */

	public ArrayList<MenuItem> getMenu() {

		return menu;

	}





	/**

	 * Sets the value of menu.

	 * @param menu The value to assign menu.

	 */

	public void setMenu(ArrayList<MenuItem> menu) {

		this.menu = menu;

	}



	
 

	/**

	 * Returns the value of rating.

	 * @return the restarurant rating
	 */

	public int getRating() {

		return rating;

	}





	/**

	 * Sets the value of rating.

	 * @param rating The value to assign rating.

	 */

	public void setRating(int rating) {

		this.rating = rating;

	}



	
	
    /**

	 * Returns the value of type.

	 * @return the value of type
	 */

	public String getType() {

		return type;

	}





	/**

	 * Sets the value of type.

	 * @param type The value to assign type.

	 */

	public void setType(String type) {

		this.type = type;

	}





	
    /** returns the value of the restaurant's name
     * @return name of the restaurant
     */
     public String getName() {
         return name;
     }
     
     /** sets the name of the restaurant
      * @param inputName the name to set for the restaurant
      */
      public void setName(String inputName) {
          name = inputName;
      }
      
      /**  iterate over the menu item, creating a string containing the menu
       * @return String menu - list of menu items
       */
       public String displayMenu() {
           int counter = 0;
           String menuString  = "";
           for (MenuItem item : menu){
                menuString = menuString + item.getName() + " ";  
                counter++;
           }
           return menuString;
       }

    /** displays the name, type and rating for the restaurant
      */
     public void display() {
         System.out.print("The restaurant " + name + " " );
         System.out.print("serves " + type + " food ");
         System.out.println("and is rated " + rating + " star/s ");
         System.out.println("The menu consists of: " + displayMenu());
    
     } 
}
