package cubbyHole;

public class Main {

	public static void main(String [] args) {
		CubbyHole cb = new CubbyHole();
		
		
		Thread pr = new Thread(new Producer(cb));
		Thread cr = new Thread(new Consumer(cb));
		
		
		cr.start();
		pr.start();
		
		
		
	}
}
