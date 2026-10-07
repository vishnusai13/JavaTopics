package MethodOverriding;

public class Movies {
	int id;
	String name;
	double budget;
	public Movies(int id, String name, double budget) {
		super();
		this.id = id;
		this.name = name;
		this.budget = budget;
	}
	@Override
	// To string is used to remove the unwanted code lang and give the required 
	//meaning full required lang...
	
	public String toString() {
		return "Movies no= " + id + ", name = " + name + ", budget = " + budget + "";
		
	}
	
}
