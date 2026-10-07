package HashSet;
import java.util.HashSet;
public class Hash_set2 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(0);
		hs.add(null);
		hs.add(100);
		hs.add(1000);
		hs.add(91);
		
		System.out.println("After adding: "+hs);
		hs.remove(1000);
		System.out.println("After Removing: "+hs);
		hs.addAll(hs);
  	    System.out.println(hs);  
		

	}

}