/** This class is the test drive for the DataInOutDemo
 *  
 *  @author pwaite
 */ 

 public class DataInOutDemoTestDrive {
 
     /** Main method is used to 
       *   1. instantiate DataInOutDemo objects
       *   2. call a method that returns data
       *   3. call a method that accepts data
       */
       public static void main(String[] args) {
           // instantiate a DataInOutDemo Object
           DataInOutDemo demo = new DataInOutDemo();
           
           // call the printString method, passing in a string to print
           demo.printString("hello!!!");
           
           // call the sendBackString method which will return a string
           String message = demo.sendBackString();
           System.out.println("The value returned was: " + message);
       }
 }
