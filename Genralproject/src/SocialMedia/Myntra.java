package SocialMedia;

public class Myntra extends PaymentAdapater {
	
	//@Override
		void UPI(){
		System.out.println("Myntra using UPI : "); 
	}
	//@override
	void CC() {
		System.out.println(" Myntra using Credit card :  ");
		
	}
	public static void main(String[] args) {
		Myntra m = new Myntra();
		m.CC();
		m.UPI();
		
	}

}
