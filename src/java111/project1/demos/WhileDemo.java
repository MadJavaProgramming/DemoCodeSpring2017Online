/** Demonstration of while logic
  *
  * @author pwaite
  **/
  public class WhileDemo {
  
      /** The main method to run our program
       *  create a variable, assign a value, and display the variable in 
       *  a while loop
       **/
       public static void main(String[] args) {
           // create a variable to hold a number
           int myNumber = 10;
           
           System.out.println("Just before the while loop");
           System.out.println();
           // while the value of myNumber is greater 0, print out myNumber
           while (myNumber < 20) {
               System.out.println("myNumber is: " + myNumber);
               myNumber = myNumber + 1;
           }
           System.out.println();
           System.out.println("After the while loop");
       }
   }  
