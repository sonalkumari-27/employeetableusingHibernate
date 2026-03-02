public class LibraryBook {
    private int employeeId;
    private String firstName;
    private String lastName;
    private double salary;
    public LibraryBook(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = 0.0;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseSalary(double percentage) {
        double increaseAmount = salary * (percentage / 100);
        salary += increaseAmount;
        System.out.println("Salary increased by " + percentage + "%. New salary: " + salary);
    }
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        LibraryBook employee = new LibraryBook(1234, "John", "Doe");
        employee.setSalary(50000);
        employee.increaseSalary(10);
        employee.displayEmployeeInfo();
    }
}
