// 10. Arithmetic Operations with Command Line Input
// Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command line. 
// Perform the specified arithmetic operation based on the operator provided. (Hint: Use switch-case for operations).


public class Q10 {
    public static void main(String[] args) {
        // Check if there are exactly 3 command line arguments: two numbers and one operator
        if (args.length != 3) {
            System.out.println("Usage: java ArithmeticOperations <number1> <operator> <number2>");
            return;
        }

        try {
            // Parse the first and third arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            char operator = args[1].charAt(0);  // The operator is the first character of the second argument

            // Perform the arithmetic operation based on the operator
            switch (operator) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    // Check for division by zero
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Unsupported operator '" + operator + "'. Use +, -, *, or /.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter valid integers.");
        }
    }
}


