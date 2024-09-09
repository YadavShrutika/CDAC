// 5. Working with java.lang.Long

//ANSWER==


// a. Explore the Java API documentation for java.lang.Long and observe its modifiers and super types.

// Modifiers and Super Types:
// The Long class is a final class, meaning it cannot be subclassed.
// It extends the Number class and implements Comparable<Long>, allowing it to be used in sorting and other comparison operations.




// b. Write a program to test how many bytes are used to represent a long value using the BYTES field. 
//(Hint: Use Long.BYTES).

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Number of bytes used to represent a long value: " + Long.BYTES);
    }
}

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5
// Number of bytes used to represent a long value: 8






// c. Write a program to find the minimum and maximum values of long using the MIN_VALUE and MAX_VALUE fields.
//(Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).

// public class Q5 {
//     public static void main(String[] args) {
//         System.out.println("Minimum value of long: " + Long.MIN_VALUE);
//         System.out.println("Maximum value of long: " + Long.MAX_VALUE);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// Minimum value of long: -9223372036854775808
// Maximum value of long: 9223372036854775807







// d. Declare a method-local variable number of type long with some value and convert it to a String using the toString method.
// (Hint: Use Long.toString(long)).

// public class Q5 {
//     public static void main(String[] args) {
//         long number = 123456789L;  // method-local variable
//         String strNumber = Long.toString(number);
//         System.out.println("Long to String: " + strNumber);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// Long to String: 123456789







// e. Declare a method-local variable strNumber of type String with some value and convert it to a long value using the 
//parseLong method. (Hint: Use Long.parseLong(String)).

// public class Q5 {
//     public static void main(String[] args) {
//         String strNumber = "9876543210";  // method-local variable
//         long number = Long.parseLong(strNumber);
//         System.out.println("String to long: " + number);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// String to long: 9876543210







// f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. 
//(Hint: parseLong method will throw a NumberFormatException).

// public class Q5 {
//     public static void main(String[] args) {
//         String strNumber = "Ab12Cd3";  // method-local variable
//         try {
//             long number = Long.parseLong(strNumber);
//             System.out.println("String to long: " + number);
//         } catch (NumberFormatException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// Exception: For input string: "Ab12Cd3"










// g. Declare a method-local variable number of type long with some value and convert it to the corresponding wrapper 
//class using Long.valueOf(). (Hint: Use Long.valueOf(long)).

// public class Q5 {
//     public static void main(String[] args) {
//         long number = 12345L;  // method-local variable
//         Long longWrapper = Long.valueOf(number);
//         System.out.println("Long to Long Wrapper: " + longWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// Long to Long Wrapper: 12345










// h. Declare a method-local variable strNumber of type String with some long value and convert it to the corresponding wrapper 
//class using Long.valueOf(). (Hint: Use Long.valueOf(String)).

// public class Q5 {
//     public static void main(String[] args) {
//         String strNumber = "67890";  // method-local variable
//         Long longWrapper = Long.valueOf(strNumber);
//         System.out.println("String to Long Wrapper: " + longWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// String to Long Wrapper: 67890











// i. Declare two long variables with values 1123 and 9845, and add them using a method from the Long class.
// (Hint: Use Long.sum(long, long)).

// public class Q5 {
//     public static void main(String[] args) {
//         long a = 1123L;
//         long b = 9845L;
//         long sum = Long.sum(a, b);
//         System.out.println("Sum of " + a + " and " + b + " is: " + sum);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// Sum of 1123 and 9845 is: 10968








// j. Declare two long variables with values 1122 and 5566, and find the minimum and maximum values using the Long class. 
//(Hint: Use Long.min(long, long) and Long.max(long, long)).

// public class Q5 {
//     public static void main(String[] args) {
//         long a = 1122L;
//         long b = 5566L;
//         long min = Long.min(a, b);
//         long max = Long.max(a, b);
//         System.out.println("Minimum of " + a + " and " + b + " is: " + min);
//         System.out.println("Maximum of " + a + " and " + b + " is: " + max);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// Minimum of 1122 and 5566 is: 1122
// Maximum of 1122 and 5566 is: 5566










// k. Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class.
// (Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).

// public class Q5 {
//     public static void main(String[] args) {
//         long number = 7;
        
//         String binaryString = Long.toBinaryString(number);
//         String octalString = Long.toOctalString(number);
//         String hexString = Long.toHexString(number);
        
//         System.out.println("Binary representation of " + number + ": " + binaryString);
//         System.out.println("Octal representation of " + number + ": " + octalString);
//         System.out.println("Hexadecimal representation of " + number + ": " + hexString);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// Binary representation of 7: 111
// Octal representation of 7: 7
// Hexadecimal representation of 7: 7











// l. Experiment with converting a long value into other primitive types or vice versa and observe the results.

// public class Q5 {
//     public static void main(String[] args) {
//         long number = 123456789L;  // method-local variable
        
        
//         int intNumber = (int) number;
//         System.out.println("Long to int: " + intNumber);
        
//         double doubleNumber = number;
//         System.out.println("Long to double: " + doubleNumber);
        
//         short shortNumber = (short) number;
//         System.out.println("Long to short : " + shortNumber);
        
//         byte byteNumber = (byte) number;
//         System.out.println("Long to byte : " + byteNumber);
        
//         float floatNumber = number;
//         System.out.println("Long to float: " + floatNumber);
        
//         int anotherInt = 1000;
//         long longFromInt = anotherInt;
//         System.out.println("Int to long: " + longFromInt);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment2> java Q5      
// Long to int: 123456789
// Long to double: 1.23456789E8
// Long to short : -13035
// Long to byte : 21
// Long to float: 1.23456792E8
// Int to long: 1000