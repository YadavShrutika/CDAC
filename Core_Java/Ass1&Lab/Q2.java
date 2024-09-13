//Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using
 //if-else to classify the BMI int categories (underweight, normal weight, overweight,etc).

import java.util.Scanner;

public class Q2 {
    public static void main(String... shruti)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in kg :");

        double weight =sc.nextDouble();

        System.out.println("Enter your height in meter :");
        
        double height =sc.nextDouble();

        double bmi = weight/(height*height);

        System.out.printf("your BMI is : %.2f\n",bmi);

        if(bmi < 30)
        {
          System.out.println("you are in underweight");
        }else if(bmi >30 && bmi <60)
        {
            System.out.println("you have normal weight");

        }else if(bmi>60 && bmi <85)
        {
            System.out.println("you are overweight");
        }else{
            System.out.println(" you are obese");
        }

        sc.close();

    }
    
}
