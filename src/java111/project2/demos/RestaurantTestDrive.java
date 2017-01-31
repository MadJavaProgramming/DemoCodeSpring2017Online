/** Class to run our restaurant program
 * @author pwaite
 */
 
public class RestaurantTestDrive {
 
 /** runs the restaurant program, creates restaurants and
  *  displays them 
  *  @param args command line arguments
  */
  
    public static void main(String[] args) {
        // create an arry to hold 3 restaurant objects
        Restaurant[] restaurants = new Restaurant[3];
        
        // counter for looping through the restaurants
        int counter = 0;
        // instantiate/creating 3 restaurant objects and assign 
        // each restaurant to an index/slot in the array
        restaurants[0] = new Restaurant();
        restaurants[1] = new Restaurant();
        restaurants[2] = new Restaurant();
        
      
        // set the name, type, and rating for each restaurant
        restaurants[0].name = "Muramotos";
        restaurants[0].type = "Japenese";
        restaurants[0].rating = 5;
        
        restaurants[1].name = "BlackIron Grill";
        restaurants[1].type = "American";
        restaurants[1].rating = 4;
        
        restaurants[2].name = "McDonalds";
        restaurants[2].type = "Fast Food";
        restaurants[2].rating = 3;
      
        // loop over the array and display each restaurant
        while (counter < restaurants.length) {
            restaurants[counter].display();
            counter++;
        }
    }
 
}
