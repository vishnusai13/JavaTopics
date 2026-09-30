package encapsulationcom.v1;

public class Atm {
	
	//HERE we can use private because private keeps in not going code into inheritance  and only used in encapsulation
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank canara = new Bank(321774855,40000);
		System.out.println("your acccount no : " +canara.getAccNo());
		System.out.println("your Balance : "  +canara.getBalance());
		canara.withdrawl(5000);
		canara.deposite(10000);
	}

}
