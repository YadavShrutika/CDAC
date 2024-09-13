import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        Logger logger = Logger.getInstance(); // Get the single instance of Logger

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create InstanceCounter");
            System.out.println("2. Log a Message");
            System.out.println("3. View Log");
            System.out.println("4. Clear Log");
            System.out.println("5. Add Employee");
            System.out.println("6. View All Employees");
            System.out.println("7. View Total Employees");
            System.out.println("8. Apply Raise to All Employees");
            System.out.println("9. View Total Salary Expense");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new InstanceCounter();
                    System.out.println("InstanceCounter created. Total instances: " + InstanceCounter.getInstanceCount());
                    break;

                case 2:
                    System.out.print("Enter a log message: ");
                    scanner.nextLine(); // consume newline
                    String message = scanner.nextLine();
                    logger.log(message);
                    System.out.println("Message logged.");
                    break;

                case 3:
                    System.out.println("Current log messages:");
                    System.out.println(logger.getLog());
                    break;

                case 4:
                    logger.clearLog();
                    System.out.println("Log cleared.");
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Employee Name: ");
                    scanner.nextLine(); // consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    Employee emp = new Employee(id, name, salary);
                    employees.add(emp);
                    System.out.println("Employee added.");
                    break;

                case 6:
                    System.out.println("All Employees:");
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;

                case 7:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;

                case 8:
                    System.out.print("Enter the raise percentage: ");
                    double percentage = scanner.nextDouble();
                    for (Employee employee : employees) {
                        employee.applyRaise(percentage);
                    }
                    System.out.println("Applied a " + percentage + "% raise to all employees.");
                    break;

                case 9:
                    System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
                    break;

                case 10:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
