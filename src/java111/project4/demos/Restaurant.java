import java.util.*;

/** Represents a restaurant in a Yelp-like system
 *
 *  @author pwaite
 */
 
public abstract class Restaurant implements Rateable {
    private String name;
    private String type; // food type
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
      
   /**  Creates the restaurant's menu as a String
    * @return String menu - list of menu items
    */
    public abstract String displayMenu();

    /** displays the name, type and rating for the restaurant
      */
    public String toString() {
        return super.toString() + "The restaurant " + name + " " + 
                "serves " + type + " food " +
                "and is rated " + rating + " star/s " +
                "The menu consists of: " + displayMenu();
     } 
}
