import java.util.*;

/** Class to create restaurants
 * @author pwaite
 */

public class RestaurantProcessor {
    
    //Restaurant[] restaurants;
    ArrayList<Restaurant> restaurants;
    
 
 /** 1. instantiate an arraylist to hold restaurants
  *  2. Call create restaurants method
  *  3. Call the display restaurants method
  */
    public void run() {
        // instantiate the array to hold 3 Restaurant objects
       // restaurants = new Restaurant[3];
       
       // instantiate the arraylist 
       restaurants = new ArrayList<Restaurant>();
        
        // call create method
        createRestaurants();
        
        // call the display method
        displayRestaurants();
    } 
    
    /** create restaurants and put them in the restaurants array
     */
     public void createRestaurants() {
        // instantiate/creating 3 restaurant objects and assign 
        // each restaurant to an index/slot in the array
        /*restaurants[0] = new Restaurant();
        restaurants[1] = new Restaurant();
        restaurants[2] = new Restaurant();*/
        
        // instantiate 3 restaurant objects and add then to the arraylist
        
        ArrayList<MenuItem> newMenu = createMenuItems();
        
        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant();
        Restaurant restaurant3 = new Restaurant();
        
        
        // set the name, type, and rating for each restaurant
        restaurant1.setName("Muramotos");
        restaurant1.setType("Japenese");
        restaurant1.setRating(5);
        restaurant1.setMenu(newMenu);
        
        restaurant2.setName("BlackIron Grill");
        restaurant2.setType("American");
        restaurant2.setRating(4);
        restaurant2.setMenu(newMenu);
        
        restaurant3.setName("McDonalds");
        restaurant3.setType("Fast Food");
        restaurant3.setRating(3);
        restaurant3.setMenu(newMenu);

        // add the restaurants to the array
        
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
     
     }
     
     /** create menu items
     */
     public ArrayList<MenuItem> createMenuItems() {
        // instantiate an array and add menu items to it.
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        
        MenuItem menuItem1 = new MenuItem();
        MenuItem menuItem2 = new MenuItem();
        MenuItem menuItem3 = new MenuItem();
        
        menuItem1.setName("Burger");
        menuItem2.setName("Chocolate Shake");
        menuItem3.setName("Fries");
        
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        
        return menu;
     }   
        
        
        
     /** iterate over the array calling the display method on each restaurant
       */
       public void displayRestaurants() {
           int counter = 0;
           // loop over the arraylist and display each restaurant using the enhanced for loop
           
           for (Restaurant restaurant : restaurants) {
               restaurant.display();
           }
       }
 
}
