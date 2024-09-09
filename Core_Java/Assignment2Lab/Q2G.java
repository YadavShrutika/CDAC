// g. Declare a method-local variable number of type byte with some value and convert it to the corresponding wrapper class using Byte.
// valueOf().
//  (Hint: Use Byte.valueOf(byte)).

public class Q2G {
   
        public static void main(String[] args) {
            byte number = 25;  // method-local variable
            Byte byteWrapper = Byte.valueOf(number);
            System.out.println("Byte to Byte Wrapper: " + byteWrapper);
        }
    }
    
    

