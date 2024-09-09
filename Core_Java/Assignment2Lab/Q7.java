// 7. Working with java.lang.Double

// ANSWER==

// a. Explore the Java API documentation for java.lang.Double and observe its modifiers and super types.

// The java.lang.Double class wraps a value of the primitive type double in an object. It provides methods for converting double to String, parsing String to double, comparing double values, and other useful operations.

// Modifiers and Super Types:
// The Double class is a final class, meaning it cannot be subclassed.
// It extends the Number class and implements Comparable<Double>, allowing it to be used in sorting and other comparison operations.





// b. Write a program to test how many bytes are used to represent a double value using the BYTES field. (Hint: Use Double.BYTES).

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Number of bytes used to represent a double value: " + Double.BYTES);
    }
}

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7
// Number of bytes used to represent a double value: 8






// c. Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE fields.
//  (Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).

//  public class Q7 {
//     public static void main(String[] args) {
//         System.out.println("Minimum value of double: " + Double.MIN_VALUE);
//         System.out.println("Maximum value of double: " + Double.MAX_VALUE);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// Minimum value of double: 4.9E-324
// Maximum value of double: 1.7976931348623157E308









// d. Declare a method-local variable number of type double with some value and convert it to a String using the toString method. 
// (Hint: Use Double.toString(double)).

// public class Q7 {
//     public static void main(String[] args) {
//         double number = 123.45;  // method-local variable
//         String strNumber = Double.toString(number);
//         System.out.println("Double to String: " + strNumber);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// Double to String: 123.45







// e. Declare a method-local variable strNumber of type String with some value and convert it to a double value using
//  the parseDouble method. (Hint: Use Double.parseDouble(String)).

//  public class Q7 {
//     public static void main(String[] args) {
//         String strNumber = "987.65";  // method-local variable
//         double number = Double.parseDouble(strNumber);
//         System.out.println("String to double: " + number);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// String to double: 987.65










// f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value.
//  (Hint: parseDouble method will throw a NumberFormatException).

//  public class Q7 {
//     public static void main(String[] args) {
//         String strNumber = "Ab12Cd3";  // method-local variable
//         try {
//             double number = Double.parseDouble(strNumber);
//             System.out.println("String to double: " + number);
//         } catch (NumberFormatException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// Exception: For input string: "Ab12Cd3"










// g. Declare a method-local variable number of type double with some value and convert it to the corresponding wrapper
//  class using Double.valueOf(). (Hint: Use Double.valueOf(double)).

//  public class Q7 {
//     public static void main(String[] args) {
//         double number = 123.45;  // method-local variable
//         Double doubleWrapper = Double.valueOf(number);
//         System.out.println("Double to Double Wrapper: " + doubleWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// Double to Double Wrapper: 123.45











// h. Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding 
// wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(String)).

// public class Q7 {
//     public static void main(String[] args) {
//         String strNumber = "678.90";  // method-local variable
//         Double doubleWrapper = Double.valueOf(strNumber);
//         System.out.println("String to Double Wrapper: " + doubleWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// String to Double Wrapper: 678.9









// i. Declare two double variables with values 112.3 and 984.5, and add them using a method from the Double class.
//  (Hint: Use Double.sum(double, double)).

//  public class Q7 {
//     public static void main(String[] args) {
//         double a = 112.3;
//         double b = 984.5;
//         double sum = Double.sum(a, b);
//         System.out.println("Sum of " + a + " and " + b + " is: " + sum);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// Sum of 112.3 and 984.5 is: 1096.8











// j. Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using the Double class. 
// (Hint: Use Double.min(double, double) and Double.max(double, double)).

// public class Q7 {
//     public static void main(String[] args) {
//         double a = 112.2;
//         double b = 556.6;
//         double min = Double.min(a, b);
//         double max = Double.max(a, b);
//         System.out.println("Minimum of " + a + " and " + b + " is: " + min);
//         System.out.println("Maximum of " + a + " and " + b + " is: " + max);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// Minimum of 112.2 and 556.6 is: 112.2
// Maximum of 112.2 and 556.6 is: 556.6










// k. Declare a double variable with the value -25.0. Find the square root of this value. (Hint: Use Math.sqrt() method).

// public class Q7 {
//     public static void main(String[] args) {
//         double number = -25.0;  // method-local variable
//         double sqrt = Math.sqrt(number);
//         System.out.println("Square root of " + number + " is: " + sqrt);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// Square root of -25.0 is: NaN









// l. Declare two double variables with the same value, 0.0, and divide them.
//  (Hint: Observe the result and any special floating-point behavior).

//  public class Q7 {
//     public static void main(String[] args) {
//         double a = 0.0;
//         double b = 0.0;
//         double result = a / b;
//         System.out.println("0.0 / 0.0 = " + result);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// 0.0 / 0.0 = NaN









// m. Experiment with converting a double value into other primitive types or vice versa and observe the results.


// public class Q7 {
//     public static void main(String[] args) {
//         double number = 123.45;  // method-local variable
        
//         // Convert double to int (explicit cast)
//         int intNumber = (int) number;
//         System.out.println("Double to int (with cast): " + intNumber);
        
//         // Convert double to float (explicit cast)
//         float floatNumber = (float) number;
//         System.out.println("Double to float (with cast): " + floatNumber);
        
//         // Convert double to short (explicit cast)
//         short shortNumber = (short) number;
//         System.out.println("Double to short (with cast): " + shortNumber);
        
//         // Convert double to byte (explicit cast)
//         byte byteNumber = (byte) number;
//         System.out.println("Double to byte (with cast): " + byteNumber);
        
//         // Convert int to double (no cast needed)
//         int anotherInt = 1000;
//         double doubleFromInt = anotherInt;
//         System.out.println("Int to double: " + doubleFromInt);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q7.java
// PS D:\CoreJava\Assignment\Assignment2> java Q7      
// Double to int (with cast): 123
// Double to float (with cast): 123.45
// Double to short (with cast): 123
// Double to byte (with cast): 123
// Int to double: 1000.0