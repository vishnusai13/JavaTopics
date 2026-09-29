package TypeCasting;

public class TC {

	public static void main(String[] args) {
		
		
		// implicit type casting;
		
		int x = 18;
		
		double d = x;
		System.out.println("original integer value x:"+x);
		System.out.println("coverstion of int to   d :"+d);
		//explicit type casting(if its no happing directly force input )
		
		double a = 34533.56;
		int b = (int) a;
		System.out.println("original integer value a:"+a);
		System.out.println("cnversion of double to int a:" +a);
		
	}

}
