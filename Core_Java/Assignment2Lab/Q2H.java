// h. Declare a method-local variable strNumber of type String with some byte value and 
// convert it to the corresponding wrapper class using Byte.valueOf(). 
// (Hint: Use Byte.valueOf(String)).


public class Q2H {
    
        public static void main(String[] args) {
            String strNumber = "30";  // method-local variable
            Byte byteWrapper = Byte.valueOf(strNumber);
            System.out.println("String to Byte Wrapper: " + byteWrapper);
        }
    }
    
    

