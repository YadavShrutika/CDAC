// 3)	Create a base class Animal with attributes like name, and methods like eat() and sleep().
//  Create a subclass Dog that inherits from Animal and has an additional method bark(). 
// Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.


// Base class Animal
class Animal {
    private String name;

    // Constructor to initialize the name
    public Animal(String name) {
        this.name = name;
    }

    // Method to simulate eating
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method to simulate sleeping
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}

// Derived class Dog
class Dog extends Animal {

    // Constructor to initialize the name of the dog
    public Dog(String name) {
        super(name); // Call the constructor of the base class Animal
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}

// Main class to test the functionality
public class Q3 {
    public static void main(String[] args) {
        // Create an Animal object
        Animal animal = new Animal("Labrador");
        animal.eat();
        animal.sleep();

        System.out.println();

        // Create a Dog object
        Dog dog = new Dog("baby labrador");
        dog.eat();   // Inherited from Animal
        dog.sleep(); // Inherited from Animal
        dog.bark();  // Specific to Dog
    }
}




// PS D:\CoreJava\Assignment\Assignment5_lab> javac Q3.java
// PS D:\CoreJava\Assignment\Assignment5_lab> java Q3      
// Labrador is eating.
// Labrador is sleeping.

// baby labrador is eating.
// baby labrador is sleeping.
// baby labrador is barking.