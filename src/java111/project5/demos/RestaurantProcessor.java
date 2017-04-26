package java111.project5.demos;

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
       restaurants = new ArrayList<>();// commented out to demo NPE
        
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
        
        System.out.println("There are " + Restaurant.count + " restaurant(s) in my system");
        //System.out.println("Just before the FineDining constructor is called");
        FineDining restaurant1 = new FineDining();
        System.out.println("After creating the first restaurant: " + restaurant1.count);
        //System.out.println("Just after the FineDining constructor was called");
        FastFood restaurant2 = new FastFood(true);
         System.out.println("After creating the second restaurant: " + restaurant2.count);
        FoodCart restaurant3 = new FoodCart();
         System.out.println("After creating the third restaurant: " + restaurant3.count);
         System.out.println("After creating the first restaurant: " + restaurant1.count);
        
        System.out.println("There are " + Restaurant.count + " restaurant(s) in my system");
        // set the name, type, and rating for each restaurant
        restaurant1.setName("Muramotos");
        restaurant1.setType("Japenese");
        restaurant1.setRating(5);
        restaurant1.setMenu(newMenu);
        restaurant1.setAcceptsReservations(true);
        
        
        restaurant2.setName("McDonalds");
        restaurant2.setType("American");
        restaurant2.setRating(4);
        restaurant2.setMenu(newMenu);
        //restaurant2.setKidsPlayArea(true);
        
        restaurant3.setName("Caracas");
        restaurant3.setType("Venezuelan");
        restaurant3.setRating(5);
        restaurant3.setMenu(newMenu);
        restaurant3.setMobileLocation("Square");

        // add the restaurants to the array
        
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
     
     }
     
     /** create menu items
      * @return The list of menu items
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
           
          
           // loop over the arraylist and display each restaurant using the enhanced for loop
           
           for (Restaurant restaurant : restaurants) {
               System.out.println(restaurant.toString());
               System.out.println();
           }
          
           //search for only businesses rated 5 
           for (Rateable rateableBusiness : restaurants) {
               if (rateableBusiness.getRating() >= 5)
                   System.out.println(rateableBusiness);
           }
           
          
       }
 
}
