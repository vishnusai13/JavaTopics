package cubbyHole;

public class Producer  implements Runnable{
	private CubbyHole cb;
	
	public Producer(CubbyHole cb){
		super();
		this.cb = cb;
		
}
	
	public void  run() {
		for(int i = 1 ; i <= 5 ; i++) {
			cb.put(i);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}

