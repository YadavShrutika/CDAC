// . Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. 
// (Hint: parseByte method will throw a NumberFormatException).


public class Q2F {
   
        public static void main(String[] args) {
            String strNumber = "Ab12Cd3";  // method-local variable
            try {
                byte number = Byte.parseByte(strNumber);
                System.out.println("String to byte: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
    
    

