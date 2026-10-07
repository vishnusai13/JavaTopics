package recursiveproblems;

public class Down_Stairs {
	
	public static void gotofloor(int n) {
		if(n>0)
		{
			System.out.println("Currently at floor :  " ) ;
			gotofloor(n-1);
			
		}
		if(n == 5)
		{
			System.out.println("Reached at Ground floor : " +n);
		}
	}
	
	
	 public static void main(String[] args)
	 {
		 gotofloor(7);
	 }
	
	

}
