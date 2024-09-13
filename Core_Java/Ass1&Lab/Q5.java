//5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle) and
 //then calculates the area based on user-provided dimensions using a switch case.

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.err.println("Select the shape to calculate the area : ");
         System.out.println("1.Circle");
         System.out.println("2.Square");
         System.out.println("3.Rectangle");
         System.out.println("4.Triangle");
         System.out.println("Enter your choice(1-4) : ");

         int choice =sc.nextInt();

         switch (choice) {
            case 1:
            System.out.println("enter the radius of the circle :");
                double radius =sc.nextDouble();
                double CircleArea = Math.PI*radius*radius;

                System.out.printf("The area of the circle is : %.2f\n",CircleArea);
                break;

                case 2:
            System.out.println("enter the side of the square :");
                double side =sc.nextDouble();
                double SquareArea = side*side;

                System.out.printf("The area of the Square is : %.2f\n",SquareArea);
                break;
               

                case 3:
                System.out.println("enter length of the rectangle :");
                    double length =sc.nextDouble();

                    System.out.println("Enter the width of the rectangle :");
                    double width = sc.nextDouble();

                    double rectangleArea =length*width;
    
                    System.out.printf("The area of the rectangle is : %.2f\n",rectangleArea);
                    break;
    

                    case 4:
                    System.out.println("enter the base of triangle :");
                        double base =sc.nextDouble();
    
                        System.out.println("Enter the height of the triangle :");
                        double height = sc.nextDouble();
    
                        double triangleArea = 0.5 * base * height;
        
                        System.out.printf("The area of the rectangle is : %.2f\n",triangleArea);
                        break;

                        default:
                        System.out.println("invalid");
                        break;
         }
         sc.close();
        

                    
         
        
         }
    }

    

