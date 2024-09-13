// 6. Working with java.lang.Float

// ANSWER==

// a. Explore the Java API documentation for java.lang.Float and observe its modifiers and super types.

// Modifiers and Super Types:
// The Float class is a final class, which means it cannot be subclassed.
// It extends the Number class and implements Comparable<Float>, allowing it to be used in sorting and 
// other comparison operations.




// b. Write a program to test how many bytes are used to represent a float value using the BYTES field. 
// (Hint: Use Float.BYTES).

public class Q6{
    public static void main(String[] args) {
        System.out.println("Number of bytes used to represent a float value: " + Float.BYTES);
    }
}

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6
// Number of bytes used to represent a float value: 4







// c. Write a program to find the minimum and maximum values of float using the MIN_VALUE and MAX_VALUE fields.
//  (Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).

//  public class Q6 {
//     public static void main(String[] args) {
//         System.out.println("Minimum value of float: " + Float.MIN_VALUE);
//         System.out.println("Maximum value of float: " + Float.MAX_VALUE);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// Minimum value of float: 1.4E-45
// Maximum value of float: 3.4028235E38







// d. Declare a method-local variable number of type float with some value and convert it to a String using the toString method.
//  (Hint: Use Float.toString(float)).

//  public class Q6 {
//     public static void main(String[] args) {
//         float number = 123.45f;  // method-local variable
//         String strNumber = Float.toString(number);
//         System.out.println("Float to String: " + strNumber);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// Float to String: 123.45







// e. Declare a method-local variable strNumber of type String with some value and convert it to a float value using the parseFloat method.
//  (Hint: Use Float.parseFloat(String)).

//  public class Q6 {
//     public static void main(String[] args) {
//         String strNumber = "987.65";  // method-local variable
//         float number = Float.parseFloat(strNumber);
//         System.out.println("String to float: " + number);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// String to float: 987.65













// f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value.
//  (Hint: parseFloat method will throw a NumberFormatException).

//  public class Q6 {
//     public static void main(String[] args) {
//         String strNumber = "Ab12Cd3";  // method-local variable
//         try {
//             float number = Float.parseFloat(strNumber);
//             System.out.println("String to float: " + number);
//         } catch (NumberFormatException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// Exception: For input string: "Ab12Cd3"







// g. Declare a method-local variable number of type float with some value and convert it to the corresponding wrapper class using
//  Float.valueOf(). (Hint: Use Float.valueOf(float)).

//  public class Q6 {
//     public static void main(String[] args) {
//         float number = 123.45f;  // method-local variable
//         Float floatWrapper = Float.valueOf(number);
//         System.out.println("Float to Float Wrapper: " + floatWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// Float to Float Wrapper: 123.45









// h. Declare a method-local variable strNumber of type String with some float value and convert it to the corresponding wrapper 
// class using Float.valueOf(). (Hint: Use Float.valueOf(String)).

// public class Q6 {
//     public static void main(String[] args) {
//         String strNumber = "678.90";  // method-local variable
//         Float floatWrapper = Float.valueOf(strNumber);
//         System.out.println("String to Float Wrapper: " + floatWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// String to Float Wrapper: 678.9







// i. Declare two float variables with values 112.3 and 984.5, and add them using a method from the Float class. 
// (Hint: Use Float.sum(float, float)).

// public class Q6 {
//     public static void main(String[] args) {
//         float a = 112.3f;
//         float b = 984.5f;
//         float sum = Float.sum(a, b);
//         System.out.println("Sum of " + a + " and " + b + " is: " + sum);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// Sum of 112.3 and 984.5 is: 1096.8








// j. Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum values using the Float class.
//  (Hint: Use Float.min(float, float) and Float.max(float, float)).

//  public class Q6 {
//     public static void main(String[] args) {
//         float a = 112.2f;
//         float b = 556.6f;
//         float min = Float.min(a, b);
//         float max = Float.max(a, b);
//         System.out.println("Minimum of " + a + " and " + b + " is: " + min);
//         System.out.println("Maximum of " + a + " and " + b + " is: " + max);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// Minimum of 112.2 and 556.6 is: 112.2
// Maximum of 112.2 and 556.6 is: 556.6









// k. Declare a float variable with the value -25.0f. Find the square root of this value. (Hint: Use Math.sqrt() method).

// public class Q6 {
//     public static void main(String[] args) {
//         float number = -25.0f;  // method-local variable
//         double sqrt = Math.sqrt(number);
//         System.out.println("Square root of " + number + " is: " + sqrt);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// Square root of -25.0 is: NaN









// l. Declare two float variables with the same value, 0.0f, and divide them.
//  (Hint: Observe the result and any special floating-point behavior).

//  public class Q6 {
//     public static void main(String[] args) {
//         float a = 0.0f;
//         float b = 0.0f;
//         float result = a / b;
//         System.out.println("0.0f / 0.0f = " + result);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// 0.0f / 0.0f = NaN








// m. Experiment with converting a float value into other primitive types or vice versa and observe the results.

// public class Q6 {
//     public static void main(String[] args) {
//         float number = 123.45f;  // method-local variable
        
//         // Convert float to int 
//         int intNumber = (int) number;
//         System.out.println("Float to int : " + intNumber);
        
//         // Convert float to double
//         double doubleNumber = number;
//         System.out.println("Float to double: " + doubleNumber);
        
       
//         short shortNumber = (short) number;
//         System.out.println("Float to short : " + shortNumber);
        
      
//         byte byteNumber = (byte) number;
//         System.out.println("Float to byte : " + byteNumber);
        
       
//         int anotherInt = 1000;
//         float floatFromInt = anotherInt;
//         System.out.println("Int to float: " + floatFromInt);
//     }
// }


// PS D:\CoreJava\Assignment\Assignment2> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment2> java Q6      
// Float to int : 123
// Float to double: 123.44999694824219
// Float to short : 123
// Float to byte : 123
// Int to float: 1000.0
