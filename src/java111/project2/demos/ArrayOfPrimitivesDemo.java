/** Class will demonstrate an array of doubles
 *
 * @author pwaite
 */
 
public class ArrayOfPrimitivesDemo {
 
    /** Create an array of doubles, add a few doubles to the array, 
     *   display each element in the array 
     *  @param args command line arguments
     */
  
    public static void main(String[] args) {
        // create an array to hold 3 doubles
        double[] myDoubles = new double[3];
        
        //counter for looping through the array
        int counter = 0;
        
        // assign values into each slot/index
        myDoubles[0] = 88.99;
        myDoubles[1] = 30.00;
        myDoubles[2] = .99;
        
        // display each element NOT using a loop
        System.out.println("Output using redundant code");
        System.out.println("The element at index 0 is: " + myDoubles[0]);
        System.out.println("The element at index 1 is: " + myDoubles[1]);
        System.out.println("The element at index 2 is: " + myDoubles[2]);
        System.out.println();
        
        // display each element using a while loop
        System.out.println("Output using a while loop to eliminate redundancy");
        while (counter < myDoubles.length) {
            System.out.println("The element at index " + counter +
                " is: " + myDoubles[counter]);
            counter++;
        }
        
    }
 
}
