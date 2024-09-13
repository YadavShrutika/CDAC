//3)Write a program that checks if a person is eligible to vote based on their age.

import java.util.Scanner;
public class Q3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");

        int age =sc.nextInt();

        if(age < 21)
        {
            System.out.println("you are not eligible for voting");
        }else if(age>=21)
        {
            System.out.println("you are eligible for voting");
        }
        sc.close();
          }
        }
