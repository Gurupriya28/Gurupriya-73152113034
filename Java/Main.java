class Employee {
    // Attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // Setter for jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to update salary with a given percentage increase
    public void updateSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to test the Employee class
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", "Software Engineer", 75000);

        // Display employee details
        employee.displayEmployeeDetails();

        // Update salary by 10%
        employee.updateSalary(10);

        // Display employee details after salary update
        System.out.println("\nAfter salary update:");
        employee.displayEmployeeDetails();
    }
}
