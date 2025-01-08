package EmployeePayroll;

abstract class Employee {
    protected String name;
    protected int id;
    protected String designation;
    protected double basicSalary;

    public Employee(String name, int id, String designation, double basicSalary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }
    public abstract double calculateSalary();

    public void displayEmployeeDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double hra; 
    private double da;  

    public FullTimeEmployee(String name, int id, String designation, double basicSalary, double hra, double da) {
        super(name, id, designation, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra + da;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, String designation, double hourlyWage, int hoursWorked) {
        super(name, id, designation, 0); // Basic salary not applicable for part-time employees
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 101, "Manager", 50000, 10000, 8000);
        fullTimeEmp.displayEmployeeDetails();
        System.out.println();
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 102, "Consultant", 200, 120);
        partTimeEmp.displayEmployeeDetails();
    }
}
