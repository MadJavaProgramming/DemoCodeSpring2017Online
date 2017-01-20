/** Class to run our restaurant program
 * @author pwaite
 */
 
 public class RestaurantTestDrive {
 
 /** runs the restaurant program, creates restaurants and
  *  displays them 
  *  @param args command line arguments
  */
  
  public static void main(String[] args) {
      // instantiate/creating a restaurant object and assign it to 
      // the myRestaurant variable
      Restaurant myRestaurant = new Restaurant();
      
      // set the name, type, and rating
      myRestaurant.name = "BlackIron Grill";
      myRestaurant.type = "American";
      myRestaurant.rating = 4;
      
      // display the restaurant
      myRestaurant.display();
  }
 
 }
