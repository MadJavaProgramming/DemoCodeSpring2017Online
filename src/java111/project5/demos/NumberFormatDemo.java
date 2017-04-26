package java111.project5.demos;

/** Demonstration of formatting numbers using the Math class (Static)
 *  and the String.format method
 *  @author pwaite
 */

public class NumberFormatDemo {
    private static int myInt = 10;// non-static instance variables are used by object

    /** runs the number format demo
     * @param command line arguments
     */
     
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("This is a random number: " + Math.random());
        
        // cannot use a non-static instance variable in a static 
        System.out.println(myInt);
        
     // formatting numbers  - Chapter 10, page 294-305
        
        System.out.println("Adding in a commas to 57349308, using String.format(...) => " + String.format("%, d", 57349308));
        System.out.println();
        
        System.out.println("Rounding 2134884.7896, using String.format(...) => " + String.format("%.2f", 2134884.7896));
        System.out.println();
    
        System.out.println("Rounding and commas 2134884.7896, using String.format(...) => " + String.format("%,.2f", 21345234.7896));
        System.out.println();
    
    
    }

}

