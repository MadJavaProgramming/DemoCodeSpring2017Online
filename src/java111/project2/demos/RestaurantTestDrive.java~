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
        restaurants[0].setName("Muramotos");
        restaurants[0].setType("Japenese");
        restaurants[0].setRating(5);
        
        restaurants[1].setName("BlackIron Grill");
        restaurants[1].setType("American");
        restaurants[1].setRating(4);
        
        restaurants[2].setName("McDonalds");
        restaurants[2].setType("Fast Food");
        restaurants[2].setRating(3);
      
        // loop over the array and display each restaurant
        while (counter < restaurants.length) {
            restaurants[counter].display();
            counter++;
        }
    }
 
}
