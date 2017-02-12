/** Class to create restaurants
 * @author pwaite
 */
 
public class RestaurantProcessor {
    
    Restaurant[] restaurants;
 
 /** 1. instantiate an array to hold restaurants
  *  2. Call create restaurants method
  *  3. Call the display restaurants method
  */
    public void run() {
        // instantiate the array to hold 3 Restaurant objects
        restaurants = new Restaurant[3];
        
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
        restaurants[0] = new Restaurant();
        restaurants[1] = new Restaurant();
        restaurants[2] = new Restaurant();
        
        MenuItem[] newMenu = createMenuItems();
        
      
        // set the name, type, and rating for each restaurant
        restaurants[0].setName("Muramotos");
        restaurants[0].setType("Japenese");
        restaurants[0].setRating(5);
        restaurants[0].setMenu(newMenu);
        
        restaurants[1].setName("BlackIron Grill");
        restaurants[1].setType("American");
        restaurants[1].setRating(4);
        restaurants[1].setMenu(newMenu);
        
        restaurants[2].setName("McDonalds");
        restaurants[2].setType("Fast Food");
        restaurants[2].setRating(3);
        restaurants[2].setMenu(newMenu);
      
     
     }
     
     /** create menu items
     */
     public MenuItem[] createMenuItems() {
        // instantiate an array and add menu items to it.
        MenuItem[] menu = new MenuItem[3];
        
        menu[0] = new MenuItem();
        menu[1] = new MenuItem();
        menu[2] = new MenuItem();
        
        menu[0].setName("Burger");
        menu[1].setName("Chocolate Shake");
        menu[2].setName("Fries");
        return menu;
     }   
        
        
        
     /** iterate over the array calling the display method on each restaurant
       */
       public void displayRestaurants() {
           int counter = 0;
           // loop over the array and display each restaurant
           while (counter < restaurants.length) {
               restaurants[counter].display();
               counter++;
        }
    }
 
}
