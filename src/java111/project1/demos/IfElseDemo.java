/** Demonstration of if/else logic
  *
  * @author pwaite
  **/
  public class IfElseDemo {
  
      /** The main method to run our program
       *  create a couple variables, assign values, and display the variables
       **/
       public static void main(String[] args) {
           // create a variable to hold a number
           int myNumber = 44;

           // create a variable to hold a String
           String valueIs55 = "The number is 55";
           String valueNot55 = "The number is not 55";
           
           // if the value is 55 print out the appropriate message
           if (myNumber == 55) {
               System.out.println(valueIs55);
           } else {
               System.out.println(valueNot55);
           }
       }
   }  
