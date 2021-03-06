/** Represents a restaurant in a Yelp-like system
 *
 *  @author pwaite
 */
 
 public class Restaurant {
     String name;
     String type;
     int rating; // number of stars, max is 5
     
 
     /** displays the name, type and rating for the restaurant
      */
      public void display() {
          System.out.print("The restaurant " + name + " " );
          System.out.print("serves " + type + " food ");
          System.out.print("and is rated " + rating + " star/s ");
       } 
 }
