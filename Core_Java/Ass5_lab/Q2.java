// 2)	Create a base class Vehicle with attributes like make and year. 
// Provide a constructor in Vehicle to initialize these attributes. 
// Derive a class Car that has an additional attribute model and write a constructor that initializes make, year, and model. 
// Write a program to create a Car object and display its details.


// Base class Vehicle
class Vehicle {
    private String make;
    private int year;

    // Constructor to initialize make and year
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Getter method for make
    public String getMake() {
        return make;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }
}

// Derived class Car
class Car extends Vehicle {
    private String model;

    // Constructor to initialize make, year, and model
    public Car(String make, int year, String model) {
        super(make, year); // Call the constructor of the Vehicle class
        this.model = model;
    }

    // Getter method for model
    public String getModel() {
        return model;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Year: " + getYear());
        System.out.println("Model: " + getModel());
    }
}

// Main class to test the functionality
public class Q2 {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Access", 2021, "125");

        // Display the car's details
        myCar.displayDetails();
    }
}


// PS D:\CoreJava\Assignment\Assignment5_lab> javac Q2.java
// PS D:\CoreJava\Assignment\Assignment5_lab> java Q2      
// Car Details:
// Make: Access
// Year: 2021
// Model: 125