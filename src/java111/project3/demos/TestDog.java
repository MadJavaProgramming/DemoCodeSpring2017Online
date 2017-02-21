/** Class to test the dog class
 *  @author pwaite  
 */
 
 public class TestDog {
 
     /** method will test the calculateDogFoodNeeds of the Dog class
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         
         // Instantiate a small Dog object.
         Dog smallDog = new Dog();
    
         // Set the weight of the dog
         smallDog.setWeight(20);
         
         // Run the food needs calculation
         int smallDogFoodResult = smallDog.calculateFoodNeeded();
         int expectedSmallDogFoodResult = 1;
    
         // Compare the results with what we expect
         // AND Output “success” or “failure”
         if (smallDogFoodResult == expectedSmallDogFoodResult) {
             System.out.println("Small Dog Test Passed");
         } else {
             System.out.println("Small Dog Test FAILED");
         }
   
         //Do some more tests!
         
         // Instantiate a small Dog object.
         Dog largeDog = new Dog();
    
         // Set the weight of the dog
         largeDog.setWeight(60);
         
         // Run the food needs calculation
         int largeDogFoodResult = largeDog.calculateFoodNeeded();
         int expectedLargeDogFoodResult = 2;
    
         // Compare the results with what we expect
         // AND Output “success” or “failure”
         if (largeDogFoodResult == expectedLargeDogFoodResult) {
             System.out.println("Large Dog Test Passed");
         } else {
             System.out.println("Large Dog Test FAILED");
         }

     
     }
 }
