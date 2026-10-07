package cubbyHole;

public class CubbyHole {

	private int contents;
	private boolean available = false;

//Consumer Takes the Data
	public synchronized int get() {
		if (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// Avail true Case
		System.out.println("Consumer Consumes the Data "+contents);
		available = false;
		// notify is used to send notificiation
//		notify();
		return contents;

	}

//Producer Giving  the data
	public synchronized void put(int value) {
		if (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// avail = false
		contents = value;
		System.out.println("Product puts : " + contents);
		available = true;
		notify();
	}

}
