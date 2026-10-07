package cubbyHole;

public class Consumer implements Runnable {
private CubbyHole cb;

//here We create a constructor 

	public Consumer(CubbyHole cb){
	super();
		this.cb = cb;
		
}
	
	public void  run() {
		for(int i = 1 ; i <= 5 ; i++) {
			cb.get();
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
