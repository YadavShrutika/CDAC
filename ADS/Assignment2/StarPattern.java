//1. Printing Patterns
//Problem: Write a Java program to print patterns such as a right triangle of stars.
//
//Test Cases:
//
//Input: n = 3
//Output:
//*
//**
//***
//Input: n = 5
//Output:
//*
//**
//***
//****
//*****



//Algorithm:
//For each row from 1 to n, print i stars (*), where i is the current row number.
//Move to the next line after printing stars for each row.

package Ass2;

import java.util.Scanner;

public class StarPattern {

    // Method to print a right triangle pattern of stars
    public static void printRightTriangle(int n) {
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case
        System.out.println("Enter the number of rows for the triangle pattern: ");
        int n = sc.nextInt();
        
        // Call the method to print the pattern
        printRightTriangle(n);
        
        // Close scanner
        sc.close();
    }
}


//Enter the number of rows for the triangle pattern: 
//3
//*
//**
//***

//Enter the number of rows for the triangle pattern: 
//5
//*
//**
//***
//****
//*****