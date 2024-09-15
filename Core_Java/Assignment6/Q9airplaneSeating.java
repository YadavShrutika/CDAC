// 9.	You need to implement a system to manage airplane seat assignments. The airplane has seats arranged in rows and columns. 
// Implement functionalities to:
// •	Initialize the seating arrangement with a given number of rows and columns.
// •	Book a seat to mark it as occupied.
// •	Cancel a booking to mark a seat as available.
// •	Check seat availability to determine if a specific seat is available.
// •	Display the current seating chart.



import java.util.Scanner;

public class Q9airplaneSeating {
    // Field: 2D array to represent the seating arrangement
    private boolean[][] seats;

    // Constructor to initialize the seating arrangement
    public Q9airplaneSeating(int rows, int columns) {
        seats = new boolean[rows][columns]; // false means the seat is available
    }

    // Method to book a seat
    public void bookSeat(int row, int column) {
        if (isValidSeat(row, column)) {
            if (!seats[row][column]) {
                seats[row][column] = true;
                System.out.println("Seat (" + row + ", " + column + ") has been booked.");
            } else {
                System.out.println("Seat (" + row + ", " + column + ") is already occupied.");
            }
        } else {
            System.out.println("Invalid seat position.");
        }
    }

    // Method to cancel a booking
    public void cancelBooking(int row, int column) {
        if (isValidSeat(row, column)) {
            if (seats[row][column]) {
                seats[row][column] = false;
                System.out.println("Booking for seat (" + row + ", " + column + ") has been cancelled.");
            } else {
                System.out.println("Seat (" + row + ", " + column + ") is already available.");
            }
        } else {
            System.out.println("Invalid seat position.");
        }
    }

    // Method to check seat availability
    public boolean isSeatAvailable(int row, int column) {
        if (isValidSeat(row, column)) {
            return !seats[row][column];
        } else {
            System.out.println("Invalid seat position.");
            return false;
        }
    }

    // Method to display the current seating chart
    public void displaySeatingChart() {
        System.out.println("\nCurrent Seating Chart:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j]) {
                    System.out.print(" X "); // X for occupied
                } else {
                    System.out.print(" O "); // O for available
                }
            }
            System.out.println();
        }
    }

    // Helper method to check if the seat position is valid
    private boolean isValidSeat(int row, int column) {
        return row >= 0 && row < seats.length && column >= 0 && column < seats[row].length;
    }

    public static void main(String[] args) {
        // Create an instance of AirplaneSeating
        Q9airplaneSeating airplane = new Q9airplaneSeating(5, 6); // 5 rows, 6 columns

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAirplane Seating Management System");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Check seat availability");
            System.out.println("4. Display seating chart");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            if (option == 5) {
                break;
            }

            int row, column;
            switch (option) {
                case 1:
                    System.out.print("Enter row number to book (0-based index): ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number to book (0-based index): ");
                    column = scanner.nextInt();
                    airplane.bookSeat(row, column);
                    break;

                case 2:
                    System.out.print("Enter row number to cancel (0-based index): ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number to cancel (0-based index): ");
                    column = scanner.nextInt();
                    airplane.cancelBooking(row, column);
                    break;

                case 3:
                    System.out.print("Enter row number to check (0-based index): ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number to check (0-based index): ");
                    column = scanner.nextInt();
                    if (airplane.isSeatAvailable(row, column)) {
                        System.out.println("Seat (" + row + ", " + column + ") is available.");
                    } else {
                        System.out.println("Seat (" + row + ", " + column + ") is occupied.");
                    }
                    break;

                case 4:
                    airplane.displaySeatingChart();
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        // Close the scanner as we no longer need user input
        scanner.close();
    }
}



// PS D:\CoreJava\Assignment\Assignment6> javac Q9airplaneSeating.java
// PS D:\CoreJava\Assignment\Assignment6> java Q9airplaneSeating

// Airplane Seating Management System
// 1. Book a seat
// 2. Cancel a booking
// 3. Check seat availability
// 4. Display seating chart
// 5. Exit
// Choose an option: 1
// Enter row number to book (0-based index): 2
// Enter column number to book (0-based index): 1
// Seat (2, 1) has been booked.

// Airplane Seating Management System
// 1. Book a seat
// 2. Cancel a booking
// 3. Check seat availability
// 4. Display seating chart
// 5. Exit
// Choose an option: 2
// Enter row number to cancel (0-based index): 2
// Enter column number to cancel (0-based index): 1
// Booking for seat (2, 1) has been cancelled.

// Airplane Seating Management System
// 1. Book a seat
// 2. Cancel a booking
// 3. Check seat availability
// 4. Display seating chart
// 5. Exit
// Choose an option: 3
// Enter row number to check (0-based index): 5
// Enter column number to check (0-based index): 4
// Invalid seat position.
// Seat (5, 4) is occupied.

// Airplane Seating Management System
// 1. Book a seat
// 2. Cancel a booking
// 3. Check seat availability
// 4. Display seating chart
// 5. Exit
// Choose an option: 4

// Current Seating Chart:
//  O  O  O  O  O  O
//  O  O  O  O  O  O
//  O  O  O  O  O  O
//  O  O  O  O  O  O
//  O  O  O  O  O  O

// Airplane Seating Management System
// 1. Book a seat
// 2. Cancel a booking
// 3. Check seat availability
// 4. Display seating chart
// 5. Exit
// Choose an option: 5