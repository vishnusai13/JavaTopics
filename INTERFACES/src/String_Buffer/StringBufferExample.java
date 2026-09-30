package String_Buffer;

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer("Vishnu");

        str1.append("Vishnu");

        System.out.println(str1);
        System.out.println(str1.indexOf("venk"));
        
        str1.length();
        
      //  str2.reverse();
        System.out.println(str1.reverse());
        
        
      //str.Length();
      		//  length will not be executed System.out.println("Length : " + str.length());
      	//Index will not be executed System.out.println("Index of K : "+str.indexOf('k'));
      		
 // chara will not be executed     		System.out.println("Character at 7th index : "+str.charAt(7));
      		
      		System.out.println(str1.replace('V' ,3, "v"));
      		
      		String str2 = " Vishnu Sai";
      		
      		// compare state will not work System.out.println(str.compareTo(str2));
      		
      	// equal state will not work	System.out.println(str.equals(str2));
      		
      	// empty is not printed	str.isEmpty();
      	//sub string also willnot be printed  System.out.println(str.substring(4));
      		
    }
}