// 5)	Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
//  Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start 
//  and stop the engines differently.


// Base class Vehicle
class Vehicle {
    // Method to start the engine (base version)
    public void startEngine() {
        System.out.println("The vehicle's engine is starting.");
    }

    // Method to stop the engine (base version)
    public void stopEngine() {
        System.out.println("The vehicle's engine is stopping.");
    }
}

// Subclass Car that extends Vehicle
class Car extends Vehicle {
    // Overriding the startEngine method for Car
    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting with a key.");
    }

    // Overriding the stopEngine method for Car
    @Override
    public void stopEngine() {
        System.out.println("The car's engine is stopping by turning off the key.");
    }
}

// Subclass Motorcycle that extends Vehicle
class Motorcycle extends Vehicle {
    // Overriding the startEngine method for Motorcycle
    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine is starting with a kick or button.");
    }

    // Overriding the stopEngine method for Motorcycle
    @Override
    public void stopEngine() {
        System.out.println("The motorcycle's engine is stopping by pressing the kill switch.");
    }
}

// Main class to test the functionality
public class Q5 {
    public static void main(String[] args) {
        // Create a Car object
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        System.out.println();

        // Create a Motorcycle object
        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}



// PS D:\CoreJava\Assignment\Assignment5_lab> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment5_lab> java Q5 
     
// The car's engine is starting with a key.
// The car's engine is stopping by turning off the key.

// The motorcycle's engine is starting with a kick or button.
// The motorcycle's engine is stopping by pressing the kill switch.