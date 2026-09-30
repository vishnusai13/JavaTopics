package encapsulationcom.v1;

public class Whatsapp {
	 
	
	public static void main(String[] args) {
		User vishnu = new  User();
		User sai = new User();
		User durga = new User();
		
		vishnu.setMsg("Lets comeplete  this task ");
		sai.setMsg("ok its upto you");
		durga.getcall();
		System.out.println(vishnu.sendMsg());
		System.out.println(sai.sendMsg());
		System.out.println(durga.getcall());
		
		
		
	}
	 
}
