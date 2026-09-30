package ConstructorChainning;

public class SBI  extends RBI{
	public SBI(){
		
// Refer directly to the immediate parent class object. It is primarily used within the context of inheritance to resolve ambiguity and reuse code-->
		
		super(); 
		
		System.out.println(" SBI Constructor ");
		
	}

}
