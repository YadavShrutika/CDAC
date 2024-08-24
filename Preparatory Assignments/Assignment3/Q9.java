import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int largestDigit = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            n = n / 10;
        }

        System.out.println("Largest digit: " + largestDigit);
    }
}


/* D:\PreparatoryAssignments\Assignment3>java Q9
Enter a number: 4825
Largest digit: 8  */