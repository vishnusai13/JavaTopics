package StringEx;

public class StringEx {

	public static void main(String[] args) {
		
		String str  = " Vishnu";
	//	 to join one string to the end of another string.
		str = str.concat("Sai");
		System.out.println("concatenation : " +str);
		
		//Creating methods 
		
		str.toUpperCase();
		System.out.println(str);
		
		str.toLowerCase();
		System.out.println("Upper case : " + str);
		
		//str.Length();
		System.out.println("Length : " + str.length());
		
		System.out.println("Index of K : "+str.indexOf('k'));
		
		System.out.println("Character at 7th index : "+str.charAt(7));
		
		System.out.println(str.replace('V' , 'v'));
		
		String str2 = " Vishnu Sai";
		
		System.out.println(str.compareTo(str2));
		
		System.out.println(str.equals(str2));
		
		str.isEmpty();
		System.out.println(str.substring(4));
		
		str.isEmpty();
		
		
	}
}
