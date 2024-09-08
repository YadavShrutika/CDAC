import java.util.Scanner;

public class LoanCalculator {

    private double principal;          // Loan amount
    private double annualInterestRate; // Annual interest rate
    private int loanTerm;              // Loan term in years

    // Method to accept user input
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount (principal) in rs: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (in years): ");
        loanTerm = scanner.nextInt();
        
        scanner.close();
    }

    // Method to calculate the monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100; // Convert annual rate to monthly and percentage
        int numberOfMonths = loanTerm * 12; // Total number of months

        // Monthly payment formula
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }

    // Method to display the payment details
    public void printRecord(double monthlyPayment) {
        int numberOfMonths = loanTerm * 12; // Total number of months
        double totalAmountPaid = monthlyPayment * numberOfMonths;

        System.out.printf("Monthly Payment: rs%.2f%n", monthlyPayment);
        System.out.printf("Total Amount Paid over the loan term: rs%.2f%n", totalAmountPaid);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        LoanCalculator calculator = new LoanCalculator();
        calculator.acceptRecord();

        double monthlyPayment = calculator.calculateMonthlyPayment();
        calculator.printRecord(monthlyPayment);
    }
}
