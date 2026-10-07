package arrayofStrings;

public class Ex1 {

	public static void main(String[] args) {
		
		String arr[] = {"Vishnu" , "Venkata" , "Sai"};
		
		
		//upper case
		
		for(int i = 0 ; i <arr.length; i++) {
			System.out.println(arr[i].toUpperCase());
		}
		

		 //Length of Each Name
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i].length()); 
		}
		
		
		// first letter of each element
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i].charAt(0)); 
		}
		
		//last letter of each element
		for(int i =0 ; i < arr.length;i++) {
		System.out.println(arr[i].charAt(arr[i].length()-1));
		}
		

	//Reverse of each element 
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = arr[i].length() - 1; j >= 0; j--) 
		
			{
				System.out.print(arr[i].charAt(j)); 
		
				}
	
			}
		System.out.println();
	}
	
}

	
