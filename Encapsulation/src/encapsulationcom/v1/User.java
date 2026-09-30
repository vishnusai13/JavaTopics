package encapsulationcom.v1;

public class User {
	//user or the main one which we require  annd can only be accesed by them
	
	private String msg;
	private double  call;
	
	//here you need declare the private and publuic both
	public double  getcall()
	{
		return call;
	}
	
//public is where it can ve accessible by all
	public String sendMsg() 
			{
		if(msg == null) {
			System.out.println("Msg cannot be Null ");
			
		}
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setcall(double call) {
		this.call = call;
	}
	
	
}