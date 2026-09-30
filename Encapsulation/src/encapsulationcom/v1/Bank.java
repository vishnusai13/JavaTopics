package encapsulationcom.v1;

public class Bank {
		
	private long accNo;

	private double balance;

	public Bank(long accNo, double balance) {

		this.accNo = accNo;

		this.balance = balance;	
	}
		public long getAccNo() {

		return accNo;
	}

	public void setAccNo(long accNo) {

		this.accNo = accNo;
	}

	public double getBalance() {

		return balance;

	}
	public void deposite(int amount) {
		if(amount > 0) {
			System.out.println("The total deposited amount is   " +amount);			
		}
			
	}	
	public void withdrawl() {
		this.withdrawl();
	}
	
	
	public void withdrawl(int balance) {
		if(balance <= 10000)
		{
			System.out.println("current balance after withdrawl  " +balance );
		}
	}

	public void setBalance(double balance) {

		this.balance = balance;

	}



}
	
	


