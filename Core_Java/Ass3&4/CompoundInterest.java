
    import java.util.Scanner;
    public class CompoundInterest {


    private double principal; // Initial investment amount
    private double annualInterestRate; // Annual interest rate
    private int numberOfCompounds; // Number of times interest is compounded per year
    private int years; // Duration of the investment in years
    private double futureValue; // Future value of the investment
    private double totalInterest; // Total interest earned

    // Method to accept input from the user
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        // Accepting user input for the principal amount
        System.out.print("Enter the initial investment amount (in rs): ");
        principal = scanner.nextDouble();
        
        // Accepting user input for the annual interest rate
        System.out.print("Enter the annual interest rate (in %): ");
        annualInterestRate = scanner.nextDouble() / 100; // Convert percentage to decimal
        
        // Accepting user input for the number of compounding periods per year
        System.out.print("Enter the number of times the interest is compounded per year: ");
        numberOfCompounds = scanner.nextInt();
        
        // Accepting user input for the investment duration in years
        System.out.print("Enter the duration of the investment (in years): ");
        years = scanner.nextInt();
        
        scanner.close(); // Close the scanner
    }

    // Method to calculate the future value of the investment
    public void calculateFutureValue() {
        // Calculating future value using the compound interest formula
        futureValue = principal * Math.pow((1 + annualInterestRate / numberOfCompounds), numberOfCompounds * years);
        // Calculating the total interest earned
        totalInterest = futureValue - principal;
    }

    // Method to print the future value and total interest earned
    public void printRecord() {
        System.out.printf("\nFuture Value of the Investment: rs%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: rs%.2f%n", totalInterest);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an instance of CompoundInterestCalculator
        CompoundInterest calculator = new CompoundInterest();
        // Accepting user input
        calculator.acceptRecord();
        // Calculating future value
        calculator.calculateFutureValue();
        // Displaying the results
        calculator.printRecord();
    }
}

    

