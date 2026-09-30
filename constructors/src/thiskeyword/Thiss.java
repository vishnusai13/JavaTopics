package thiskeyword;

public class Thiss {


	
//------>HERE "THIS" REFERS TO THE OBJECT WHICH IS BEEN CALLED. 
//----> HERE THIS IS USED WHEN THE INSTANCE VARAIABLE AND PARAMETER HAVING THE SAME NAME  THEN THIS . IS USED SO THATH TPO AVOID PROBLEMS	
				
	
	int id = 18; //Instance varaible;
			String name = "vishnu";
			
			public Thiss(int id , String name) {
				this.id = id;
				
			//	this.name=name;
				System.out.println(id + name);
				System.out.println(this.id + this .name);
	
}
			public static void main(String[] args) {
				Thiss obj = new Thiss(1, "Sravani");
						obj.id = 18;
							obj.name  = "sai";
				
								Thiss obj1 = new Thiss(2,"venkata");
				Thiss obj2= new Thiss(3,"varsha");
				Thiss obj3 = new Thiss(4,"naga");
				
				
			}
		
	}

