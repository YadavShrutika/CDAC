import java.util.Scanner;

public class DiscountCalculator {
    private double originalPrice; // Original price of the item
    private double discountRate;  // Discount percentage
    private double discountAmount; // Calculated discount amount
    private double finalPrice;     // Final price after applying the discount

    // Method to accept the original price and discount rate from the user
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        // Accepting user input for the original price of the item
        System.out.print("Enter the original price of the item (in rs): ");
        originalPrice = scanner.nextDouble();
        
        // Accepting user input for the discount rate
        System.out.print("Enter the discount percentage: ");
        discountRate = scanner.nextDouble();
        
        scanner.close(); // Close the scanner
    }

    // Method to calculate the discount amount and the final price
    public void calculateDiscount() {
        // Calculating the discount amount
        discountAmount = originalPrice * (discountRate / 100);
        // Calculating the final price after applying the discount
        finalPrice = originalPrice - discountAmount;
    }

    // Method to print the discount amount and the final price
    public void printRecord() {
        System.out.printf("\nDiscount Amount: rs%.2f%n", discountAmount);
        System.out.printf("Final Price of the Item: rs%.2f%n", finalPrice);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an instance of DiscountCalculator
        DiscountCalculator calculator = new DiscountCalculator();
        // Accepting user input for original price and discount rate
        calculator.acceptRecord();
        // Calculating discount amount and final price
        calculator.calculateDiscount();
        // Displaying the discount amount and final price
        calculator.printRecord();
    }
}
