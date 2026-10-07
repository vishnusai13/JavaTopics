package MethodOverriding;

public class Dynamic_MethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Emp e = new Emp(18);
		Dev d = new Dev();
		Tester t = new Tester("Vishnu");
		
		Emp e1 = new Dev();// only can print 3 methhods out of 6 
		
		

	}
	

}
