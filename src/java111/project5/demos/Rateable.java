package java111.project5.demos;

import java.util.*;
/** interface to provide rateability to classes 
 * @author pwaite
 */
 
 public interface Rateable {
     /* the rating of the item 
      *@return the item's rating
      */
     public abstract int getRating();
     /* sets the rating
      * @param the rating value
      */
     public abstract void setRating(int ratingValue);

 } 

