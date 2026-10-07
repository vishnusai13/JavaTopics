package HashSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Comparator {

    public static void main(String[] args) {

        Employee e1 = new Employee(3, "vishnu", 150000);
        Employee e2 = new Employee(1, "sai", 250000);
        Employee e3 = new Employee(2, "bunny", 200000);
        Employee e4 = new Employee(4, "sunny", 100000);
        Employee e5 = new Employee(5, "hari", 10000);

        // Comparator for sorting employees by salary
        Comparator<Employee> salaryComparator =
                (emp1, emp2) -> Double.compare(
                        emp1.getSal(),
                        emp2.getSal()
                );

        // Create TreeSet using Comparator
        TreeSet<Employee> te = new TreeSet<>(salaryComparator);

        // Add employees
        te.add(e1);
        te.add(e2);
        te.add(e3);
        te.add(e4);
        te.add(e5);

        // Print employees
        for (Employee e : te) {
            System.out.println(e);
        }
    }
}