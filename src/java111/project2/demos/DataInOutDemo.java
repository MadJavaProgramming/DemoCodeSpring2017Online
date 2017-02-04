/** This class demonstrates 
  *  1. passing data into a method
  *  2. return data from a method
  * 
  *  @author pwaite
  */
  public class DataInOutDemo {
  
      /** method accepts a string value and 
       * writes the value out
       * @param inputString the string to be displayed
       */
       public void printString(String inputString) {
           System.out.println("The string is : " + inputString);
       }
       
       /** method will return a string
        *  @return a message
        */
        public String sendBackString() {
            return "Goodbye";
        }
  
  
  }
