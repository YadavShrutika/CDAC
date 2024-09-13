//i. Experiment with converting a byte value into other primitive types or vice versa and observe the results

public class Q2I {
    public static void main(String[] args) {
        byte number = 15;  // method-local variable
        
        // Convert byte to int
        int intNumber = number;
        System.out.println("Byte to int: " + intNumber);
        
        // Convert byte to double
        double doubleNumber = number;
        System.out.println("Byte to double: " + doubleNumber);
        
        // Convert byte to short
        short shortNumber = number;
        System.out.println("Byte to short: " + shortNumber);
        
        // Convert byte to float
        float floatNumber = number;
        System.out.println("Byte to float: " + floatNumber);
        
        // Convert int to byte (explicit cast)
        int largeNumber = 100;
        byte byteNumber = (byte) largeNumber;
        System.out.println("Int to byte (with cast): " + byteNumber);
    }
}
