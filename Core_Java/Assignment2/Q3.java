// 3. Working with java.lang.Short

//ANSWER==

// a. Explore the Java API documentation for java.lang.Short and observe its modifiers and super types.
// The java.lang.Short class wraps a value of the primitive type short in an object. 
//It provides several methods to work with short values.

// Modifiers and Super Types:
// The Short class is a final class, meaning it cannot be subclassed.
// It extends the Number class and implements Comparable<Short>, allowing it to be used in sorting and other comparable contexts.



// b. Write a program to test how many bytes are used to represent a short value using the BYTES field. (Hint: Use Short.BYTES).


public class Q3 {
    public static void main(String[] args) {
        System.out.println("Number of bytes used to represent a short value: " + Short.BYTES);
    }
}

//   output=  PS D:\CoreJava\Assignment\Assignment2> javac Q3.java
//             PS D:\CoreJava\Assignment\Assignment2> java Q3
// Number of bytes used to represent a short value: 2






// c. Write a program to find the minimum and maximum values of short using the MIN_VALUE and MAX_VALUE fields.
// (Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).

// public class Q3 {
//     public static void main(String[] args) {
//         System.out.println("Minimum value of short: " + Short.MIN_VALUE);
//         System.out.println("Maximum value of short: " + Short.MAX_VALUE);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q3.java
// PS D:\CoreJava\Assignment\Assignment2> java Q3      
// Minimum value of short: -32768
// Maximum value of short: 32767





// d. Declare a method-local variable number of type short with some value and convert it to a String using the toString method. 
//(Hint: Use Short.toString(short)).

// public class Q3 {
//     public static void main(String[] args) {
//         short number = 100;  // method-local variable
//         String strNumber = Short.toString(number);
//         System.out.println(strNumber);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q3.java
// PS D:\CoreJava\Assignment\Assignment2> java Q3      
// 100




// e. Declare a method-local variable strNumber of type String with some value and convert it to a short value using the parseShort method.
// (Hint: Use Short.parseShort(String)).

// public class Q3 {
//     public static void main(String[] args) {
//         String strNumber = "150";  // method-local variable
//         short number = Short.parseShort(strNumber);
//         System.out.println("String to short: " + number);
//     }
// }
// PS D:\CoreJava\Assignment\Assignment2> javac Q3.java
// PS D:\CoreJava\Assignment\Assignment2> java Q3      
// String to short: 150





// f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a short value. 
//(Hint: parseShort method will throw a NumberFormatException).

// public class Q3 {
//     public static void main(String[] args) {
//         String strNumber = "Ab12Cd3";  // method-local variable
//         try {
//             short number = Short.parseShort(strNumber);
//             System.out.println("String to short: " + number);
//         } catch (NumberFormatException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q3.java
// PS D:\CoreJava\Assignment\Assignment2> java Q3      
// Exception: For input string: "Ab12Cd3"






// g. Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper 
//class using Short.valueOf(). (Hint: Use Short.valueOf(short)).

// public class Q3 {
//     public static void main(String[] args) {
//         short number = 200;  // method-local variable
//         Short shortWrapper = Short.valueOf(number);
//         System.out.println("Short to Short Wrapper: " + shortWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q3.java
// PS D:\CoreJava\Assignment\Assignment2> java Q3      
// Short to Short Wrapper: 200






// h. Declare a method-local variable strNumber of type String with some short value and convert it to the corresponding wrapper
// class using Short.valueOf(). (Hint: Use Short.valueOf(String)).


// public class Q3 {
//     public static void main(String[] args) {
//         String strNumber = "300";  // method-local variable
//         Short shortWrapper = Short.valueOf(strNumber);
//         System.out.println( shortWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q3.java
// PS D:\CoreJava\Assignment\Assignment2> java Q3      
// 300






// i. Experiment with converting a short value into other primitive types or vice versa and observe the results.


// public class Q3 {
//     public static void main(String[] args) {
//         short number = 250;  // method-local variable
        
//         int intNumber = number;
//         System.out.println("Short to int: " + intNumber);
        
//         double doubleNumber = number;
//         System.out.println("Short to double: " + doubleNumber);
        

//         byte byteNumber = (byte) number;
//         System.out.println("Short to byte (with cast): " + byteNumber);
        
//         float floatNumber = number;
//         System.out.println("Short to float: " + floatNumber);
        
//         int largeNumber = 32000;
//         short shortNumber = (short) largeNumber;
//         System.out.println("Int to short (with cast): " + shortNumber);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q3.java
// PS D:\CoreJava\Assignment\Assignment2> java Q3      
// Short to int: 250
// Short to double: 250.0
// Short to byte (with cast): -6
// Short to float: 250.0
// Int to short (with cast): 32000