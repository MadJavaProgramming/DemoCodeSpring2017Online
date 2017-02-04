/** Class used to demonstrate comparing primitives and objects
 * @author pwaite
 */

 public class ComparisonDemo {
 
     /** method to compare primitives
      */
      public void comparePrimitives() {
          int myInt = 4;
          byte myByte = 4;
          if (myInt == myByte) {
              System.out.println("The values are the same!");
          }
      }
      
      /** method to compare objects
      */
      public void compareObjects() {
          PoorDog dog1 = new PoorDog();
          PoorDog dog2 = new PoorDog();
          
          dog1.setName("Fido");
          dog2.setName("Fido");
          
          if (dog1 == dog2) {
              System.out.println("The dog variables point to the same object!");
          } else {
              System.out.println("The dog variables point to different objects!");
          }
          
          String dog1Name = dog1.getName();
          String dog2Name = dog2.getName();
          
          if (dog1Name.equals(dog2Name)) {  // use .equals for String comparisons
              System.out.println("The dog names are the same");
          }
       }
      
      /** method to call the two comparison methods */
      public void run() {
          comparePrimitives();
          compareObjects();
      }
 
 
 }
