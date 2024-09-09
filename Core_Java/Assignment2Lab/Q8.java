// 8. Conversion between Primitive Types and Strings
// Initialize a variable of each primitive type with a user-defined value and convert it into String:
// 	First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
// 	Then, use the valueOf method of the String class. (e.g., String.valueOf()).


    public class Q8 {
        public static void main(String[] args) {
            // Initialize variables of each primitive type
            byte byteValue = 10;
            short shortValue = 20;
            int intValue = 30;
            long longValue = 40L;
            float floatValue = 50.5f;
            double doubleValue = 60.6;
            char charValue = 'A';
            boolean booleanValue = true;
    
            // Convert to String using the toString method of the corresponding wrapper class
            String byteToString = Byte.toString(byteValue);
            String shortToString = Short.toString(shortValue);
            String intToString = Integer.toString(intValue);
            String longToString = Long.toString(longValue);
            String floatToString = Float.toString(floatValue);
            String doubleToString = Double.toString(doubleValue);
            String charToString = Character.toString(charValue);
            String booleanToString = Boolean.toString(booleanValue);
    
            // Convert to String using the valueOf method of the String class
            String byteToStringValueOf = String.valueOf(byteValue);
            String shortToStringValueOf = String.valueOf(shortValue);
            String intToStringValueOf = String.valueOf(intValue);
            String longToStringValueOf = String.valueOf(longValue);
            String floatToStringValueOf = String.valueOf(floatValue);
            String doubleToStringValueOf = String.valueOf(doubleValue);
            String charToStringValueOf = String.valueOf(charValue);
            String booleanToStringValueOf = String.valueOf(booleanValue);
    
            // Print the results
            System.out.println("Using toString method of Wrapper Classes:");
            System.out.println("Byte to String: " + byteToString);
            System.out.println("Short to String: " + shortToString);
            System.out.println("Int to String: " + intToString);
            System.out.println("Long to String: " + longToString);
            System.out.println("Float to String: " + floatToString);
            System.out.println("Double to String: " + doubleToString);
            System.out.println("Char to String: " + charToString);
            System.out.println("Boolean to String: " + booleanToString);
    
            System.out.println("\nUsing valueOf method of String Class:");
            System.out.println("Byte to String: " + byteToStringValueOf);
            System.out.println("Short to String: " + shortToStringValueOf);
            System.out.println("Int to String: " + intToStringValueOf);
            System.out.println("Long to String: " + longToStringValueOf);
            System.out.println("Float to String: " + floatToStringValueOf);
            System.out.println("Double to String: " + doubleToStringValueOf);
            System.out.println("Char to String: " + charToStringValueOf);
            System.out.println("Boolean to String: " + booleanToStringValueOf);
        }
    }
    


//     PS D:\CoreJava\Assignment\Assignment2> java Q8
// Using toString method of Wrapper Classes:
// Byte to String: 10
// Short to String: 20
// Int to String: 30
// Long to String: 40
// Float to String: 50.5
// Double to String: 60.6
// Char to String: A
// Boolean to String: true

// Using valueOf method of String Class:
// Byte to String: 10
// Short to String: 20
// Int to String: 30
// Long to String: 40
// Float to String: 50.5
// Double to String: 60.6
// Char to String: A
// Boolean to String: true