package HashSet;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double sal;
	public Employee(int id,String name,double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Employee e) {//We can also compare with salary also
		if(this.id < e.id) {			// using this same method
			return -1;
		}
		else if (this.id > e.id){
			return 1; 
		}else {
			return 0;
		}
	}
	

}