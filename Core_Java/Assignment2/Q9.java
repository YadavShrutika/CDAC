// 9. Default Values of Primitive Types
// Declare variables of each primitive type as fields of a class and check their default values. 
// (Note: Default values depend on whether the variables are instance variables or static variables).





public class Q9 {
    // Instance variables
    byte instanceByte;
    short instanceShort;
    int instanceInt;
    long instanceLong;
    float instanceFloat;
    double instanceDouble;
    char instanceChar;
    boolean instanceBoolean;

    // Static variables
    static byte staticByte;
    static short staticShort;
    static int staticInt;
    static long staticLong;
    static float staticFloat;
    static double staticDouble;
    static char staticChar;
    static boolean staticBoolean;

    public static void main(String[] args) {
        // Creating an instance of the class to access instance variables
        Q9 obj = new Q9();

        // Printing default values of instance variables
        System.out.println("Default values of instance variables:");
        System.out.println("byte: " + obj.instanceByte);        // 0
        System.out.println("short: " + obj.instanceShort);      // 0
        System.out.println("int: " + obj.instanceInt);          // 0
        System.out.println("long: " + obj.instanceLong);        // 0L
        System.out.println("float: " + obj.instanceFloat);      // 0.0f
        System.out.println("double: " + obj.instanceDouble);    // 0.0d
        System.out.println("char: '" + obj.instanceChar + "'"); // '\u0000' (null character)
        System.out.println("boolean: " + obj.instanceBoolean);  // false

        // Printing default values of static variables
        System.out.println("\nDefault values of static variables:");
        System.out.println("byte: " + staticByte);        // 0
        System.out.println("short: " + staticShort);      // 0
        System.out.println("int: " + staticInt);          // 0
        System.out.println("long: " + staticLong);        // 0L
        System.out.println("float: " + staticFloat);      // 0.0f
        System.out.println("double: " + staticDouble);    // 0.0d
        System.out.println("char: '" + staticChar + "'"); // '\u0000' (null character)
        System.out.println("boolean: " + staticBoolean);  // false
    }
}


// PS D:\CoreJava\Assignment\Assignment2> javac Q9.java
// PS D:\CoreJava\Assignment\Assignment2> java Q9
// Default values of instance variables:
// byte: 0
// short: 0
// int: 0
// long: 0
// float: 0.0
// double: 0.0
// char: ''
// boolean: false

// Default values of static variables:
// byte: 0
// short: 0
// int: 0
// long: 0
// float: 0.0
// double: 0.0
// char: ''
// boolean: false


// Instance Variables: These are fields that are associated with instances of the class. When you create an object of the class, these fields are initialized with their default values.

// Static Variables: These are fields that are associated with the class itself, rather than any specific instance. They are also initialized with default values when the class is loaded.

// Default Values of Primitive Types:
// byte: 0
// short: 0
// int: 0
// long: 0L
// float: 0.0f
// double: 0.0d
// char: '\u0000' (null character)
// boolean: false
// Both instance and static variables have the same default values for their types when not explicitly initialized.