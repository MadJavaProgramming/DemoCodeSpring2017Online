/** Class will demonstrate several of the primitive variable types

 * @author pwaite
 */
 
public class PrimitiveDemo {
 
 /** Create several primitive variables, assign values, 
        and display those values.
  *  @param args command line arguments
  */
  
    public static void main(String[] args) {
        int myInt = 888;
        long myLong = 888889889;
        char myChar = 'h';
        float myFloat = 900.99f; // 32 bits
        double myDouble = 66.87; // 64 bits
        
        // display the values
        System.out.println("The variable and their values are: ");
        System.out.println("myInt is: " + myInt);
        System.out.println("myLong is: " + myLong);
        System.out.println("myChar is: " + myChar);
        System.out.println("myFloat is: " + myFloat);
        System.out.println("myDouble is: " + myDouble);
        
        // add the float and the double together
        System.out.println("myFloat + myDouble = " + (myFloat + myDouble));
        
        
    }
 
}
