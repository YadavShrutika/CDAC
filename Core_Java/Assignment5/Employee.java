import java.util.ArrayList;
import java.util.List;

public class Employee {
    // Static fields to track total employees and total salary expense
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    // Instance fields for individual employee details
    private int id;
    private String name;
    private double salary;

    // Static initializer block (optional but included for demonstration)
    static {
        totalEmployees = 0;
        totalSalaryExpense = 0.0;
    }

    // Constructor to initialize an employee
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Update the total salary expense when salary is changed
        totalSalaryExpense -= this.salary;
        this.salary = salary;
        totalSalaryExpense += salary;
    }

    // Static method to get the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Static method to calculate the total salary expense
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // Method to apply a percentage raise to the salary
    public void applyRaise(double percentage) {
        double raise = salary * (percentage / 100);
        setSalary(salary + raise); // Update salary using the setter to adjust total expense
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
