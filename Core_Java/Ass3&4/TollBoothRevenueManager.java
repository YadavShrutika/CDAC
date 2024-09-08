import java.util.Scanner;

public class TollBoothRevenueManager {
    private double carTollRate;     
    private double truckTollRate;   
    private double motorcycleTollRate; 
    private int numCars;            
    private int numTrucks;          
    private int numMotorcycles;     
    private double totalRevenue;    
    private int totalVehicles;      

    
    public void setTollRates() {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter toll rate for Car (in rs): ");
        carTollRate = scanner.nextDouble();
        
       
        System.out.print("Enter toll rate for Truck (in rs): ");
        truckTollRate = scanner.nextDouble();
        
       
        System.out.print("Enter toll rate for Motorcycle (in rs): ");
        motorcycleTollRate = scanner.nextDouble();
    }

   
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of Cars: ");
        numCars = scanner.nextInt();
        
       
        System.out.print("Enter the number of Trucks: ");
        numTrucks = scanner.nextInt();
        
       
        System.out.print("Enter the number of Motorcycles: ");
        numMotorcycles = scanner.nextInt();
    }

    // Method to calculate the total revenue and total number of vehicles
    public void calculateRevenue() {
        // Calculating the total revenue collected
        totalRevenue = (numCars * carTollRate) + (numTrucks * truckTollRate) + (numMotorcycles * motorcycleTollRate);
        // Calculating the total number of vehicles
        totalVehicles = numCars + numTrucks + numMotorcycles;
    }

    // Method to print the total number of vehicles and total revenue collected
    public void printRecord() {
        System.out.printf("\nTotal number of vehicles: %d%n", totalVehicles);
        System.out.printf("Total revenue collected: rs%.2f%n", totalRevenue);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an instance of TollBoothRevenueManager
        TollBoothRevenueManager manager = new TollBoothRevenueManager();
        // Setting toll rates for each vehicle type
        manager.setTollRates();
        // Accepting the number of vehicles passing through the toll booth
        manager.acceptRecord();
        // Calculating the total revenue and number of vehicles
        manager.calculateRevenue();
        // Displaying the total number of vehicles and total revenue collected
        manager.printRecord();
    }
    
}
