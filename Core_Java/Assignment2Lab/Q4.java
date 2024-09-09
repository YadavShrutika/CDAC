// 4. Working with java.lang.Integer





//ANSWER ==

// a: Exploring the Java API for java.lang.Integer
// Modifiers and Super Types:
// The Integer class is a final class, meaning it cannot be subclassed.
// It extends the Number class and implements Comparable<Integer>, which allows instances of this class to be used in sorting and comparison operations.




// b. Write a program to test how many bytes are used to represent an int value using the BYTES field. (Hint: Use Integer.BYTES).

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Number of bytes used to represent an int value: " + Integer.BYTES);
    }
}

// output==
// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4
// Number of bytes used to represent an int value: 4





// c. Write a program to find the minimum and maximum values of int using the MIN_VALUE and MAX_VALUE fields. 
//(Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).

// public class Q4 {
//     public static void main(String[] args) {
//         System.out.println("Minimum value of int: " + Integer.MIN_VALUE);
//         System.out.println("Maximum value of int: " + Integer.MAX_VALUE);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// Minimum value of int: -2147483648
// Maximum value of int: 2147483647






// d. Declare a method-local variable number of type int with some value and convert it to a String using the toString method.
// (Hint: Use Integer.toString(int)).

// public class Q4 {
//     public static void main(String[] args) {
//         int number = 1234;  // method-local variable
//         String strNumber = Integer.toString(number);
//         System.out.println("Integer to String: " + strNumber);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// Integer to String: 1234






// e. Declare a method-local variable strNumber of type String with some value and convert it to an int value using the parseInt method. 
//(Hint: Use Integer.parseInt(String)).

// public class Q4 {
//     public static void main(String[] args) {
//         String strNumber = "5678";  // method-local variable
//         int number = Integer.parseInt(strNumber);
//         System.out.println("String to int: " + number);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// String to int: 5678





// f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to an int value.
//(Hint: parseInt method will throw a NumberFormatException).

// public class Q4 {
//     public static void main(String[] args) {
//         String strNumber = "Ab12Cd3";  // method-local variable
//         try {
//             int number = Integer.parseInt(strNumber);
//             System.out.println("String to int: " + number);
//         } catch (NumberFormatException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// Exception: For input string: "Ab12Cd3"








// g. Declare a method-local variable number of type int with some value and convert it to the corresponding
// wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(int)).

// public class Q4 {
//     public static void main(String[] args) {
//         int number = 42;  // method-local variable
//         Integer intWrapper = Integer.valueOf(number);
//         System.out.println("Int to Integer Wrapper: " + intWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// Int to Integer Wrapper: 42







// h. Declare a method-local variable strNumber of type String with some integer value and convert it to the corresponding
// wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(String)).

// public class Q4 {
//     public static void main(String[] args) {
//         String strNumber = "8765";  // method-local variable
//         Integer intWrapper = Integer.valueOf(strNumber);
//         System.out.println("String to Integer Wrapper: " + intWrapper);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// String to Integer Wrapper: 8765








// i. Declare two integer variables with values 10 and 20, and add them using a method from the Integer class. 
//(Hint: Use Integer.sum(int, int)).

// public class Q4 {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int sum = Integer.sum(a, b);
//         System.out.println("Sum of " + a + " and " + b + " is: " + sum);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// Sum of 10 and 20 is: 30







// j. Declare two integer variables with values 10 and 20, and find the minimum and maximum values using the Integer class.
// (Hint: Use Integer.min(int, int) and Integer.max(int, int)).

// public class Q4 {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int min = Integer.min(a, b);
//         int max = Integer.max(a, b);
//         System.out.println("Minimum of " + a + " and " + b + " is: " + min);
//         System.out.println("Maximum of " + a + " and " + b + " is: " + max);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// Minimum of 10 and 20 is: 10
// Maximum of 10 and 20 is: 20







// k. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from 
//the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).

// public class Q4 {
//     public static void main(String[] args) {
//         int number = 7;
        
//         String binaryString = Integer.toBinaryString(number);
//         String octalString = Integer.toOctalString(number);
//         String hexString = Integer.toHexString(number);
        
//         System.out.println("Binary representation of " + number + ": " + binaryString);
//         System.out.println("Octal representation of " + number + ": " + octalString);
//         System.out.println("Hexadecimal representation of " + number + ": " + hexString);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// Binary representation of 7: 111
// Octal representation of 7: 7
// Hexadecimal representation of 7: 7





// l. Experiment with converting an int value into other primitive types or vice versa and observe the results.

// public class Q4 {
//     public static void main(String[] args) {
//         int number = 123;  // method-local variable
        

//         double doubleNumber = number;
//         System.out.println("Int to double: " + doubleNumber);
        

//         short shortNumber = (short) number;
//         System.out.println("Int to short : " + shortNumber);
        

//         byte byteNumber = (byte) number;
//         System.out.println("Int to byte : " + byteNumber);
        

//         float floatNumber = number;
//         System.out.println("Int to float: " + floatNumber);
        

//         long largeNumber = 9876543210L;
//         int intNumber = (int) largeNumber;
//         System.out.println("Long to int : " + intNumber);
//     }
// }

// PS D:\CoreJava\Assignment\Assignment2> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment2> java Q4      
// Int to double: 123.0
// Int to short : 123
// Int to byte : 123
// Int to float: 123.0
// Long to int : 1286608618