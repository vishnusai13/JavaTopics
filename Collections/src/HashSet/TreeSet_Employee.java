package HashSet;

import java.util.ListIterator;
import java.util.TreeSet;
public class TreeSet_Employee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(3,"vishnu", 150000);
		Employee e2 = new Employee(1,"sai",250000);
		Employee e3 = new Employee(2,"bunny",200000);
		Employee e4 = new Employee(4,"sunny",100000);
		Employee e5 = new Employee(5,"hari",10000);
		
		TreeSet<Employee> te = new TreeSet<>();
		
		te.add(e5);
		te.add(e3);
		te.add(e1);
		te.add(e4);
		te.add(e2);
		//System.out.println(te);//output will be in single line 
		for(Employee e: te) {
			System.out.println(e);
		}
	}

}