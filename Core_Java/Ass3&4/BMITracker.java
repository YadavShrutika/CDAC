import java.util.Scanner;

public class BMITracker {
    private double weight; // Weight in kilograms
    private double height; // Height in meters
    private double bmi; // Calculated BMI
    private String classification; // BMI classification

    // Method to accept weight and height from the user
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        // Accepting user input for weight in kilograms
        System.out.print("Enter your weight (in kg): ");
        weight = scanner.nextDouble();
        
        // Accepting user input for height in meters
        System.out.print("Enter your height (in meters): ");
        height = scanner.nextDouble();
        
        scanner.close(); // Close the scanner
    }

    // Method to calculate the BMI using the formula: BMI = weight / (height * height)
    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    // Method to classify the BMI into one of the categories
    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    // Method to print the BMI value and its classification
    public void printRecord() {
        System.out.printf("\nYour BMI is: %.2f%n", bmi);
        System.out.println("BMI Classification: " + classification);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an instance of BMITracker
        BMITracker tracker = new BMITracker();
        // Accepting user input for weight and height
        tracker.acceptRecord();
        // Calculating BMI
        tracker.calculateBMI();
        // Classifying the BMI
        tracker.classifyBMI();
        // Displaying the BMI and classification
        tracker.printRecord();
    }
}
