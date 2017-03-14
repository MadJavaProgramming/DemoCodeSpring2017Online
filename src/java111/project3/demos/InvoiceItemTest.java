/** Test code for the InvoiceItem from project 2 
 * 
 *  @author pwaite
**/
public class InvoiceItemTest {

    /** test the invoice item calculation 
     *  @param args command line arguments
    **/
    public static void main(String[] args) {
        // 1. create invoice item
        InvoiceItem item = new InvoiceItem();
        
        //2. assign quantity and price
        item.setPrice(10.00);
        item.setQuantity(5);
        
        //3. create variable for the actual value returned by the calculate method
        //5. Call the method to be tested and assign the result to the actual value variable
        double actualTotal = item.calculateTotal();
        
        //4. create a variable for the expected value, and assign the expected value
        double expectedTotal = 50.00;
        
        //6. Compare the actual value to the expected value and display a message of success or fail
        if (actualTotal == expectedTotal) {
            System.out.println("calculateTotal: Success");
        } else {
            System.out.println("calculateTotal: Failure");
        }
    }
    
}

