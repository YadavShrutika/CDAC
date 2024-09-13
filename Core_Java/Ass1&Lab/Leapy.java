//using switch case
 import java.util.Scanner;

public class Leapy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");

        int year = sc.nextInt();
        
         //calculate value for switch case
        int divisibleby4 = year % 4 == 0 ? 1 : 0;
        int divisibleby100 = year % 100 == 0 ? 1 : 0;
        int divisibleby400 = year % 100 == 0 ? 1 : 0;

        switch (divisibleby4) {
            case 0:
                System.out.println(year + " is not a leap year.");
                break;
            case 1:
                switch (divisibleby100) {
                    case 0:
                        System.out.println(year + " is a leap year.");
                        break;
                    case 1:
                        switch (divisibleby400) {
                            case 0:
                                System.out.println(year + " is not a leap year.");
                                break;
                            case 1:
                                System.out.println(year + " is a leap year.");
                                break;
                            }
                            break;
                    }
                    break;
            }
    
            // Close the scanner
            sc.close();
        }
    }

                                
