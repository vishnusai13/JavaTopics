
package ConstructorChainning;

public class Emplotee {

    int id;
    String name;
    double salary;

    // Master constructor
    public Emplotee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Constructor with id and name
    public Emplotee(int id, String name) {
        this(id, name, 25000.0);
    }

    // Constructor with only id
    public Emplotee(int id) {
        this(id, "Unknown", 25000.0);
    }

    // No-argument constructor
    public Emplotee() {
        this(0, "Unknown", 0.0);
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Using 4 different constructors

        Emplotee e1 = new Emplotee(101, "Vishnu", 50000.0);
        Emplotee e2 = new Emplotee(102, "Sai");
        Emplotee e3 = new Emplotee(103);
        Emplotee e4 = new Emplotee();

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        e4.displayDetails();
    }
}
