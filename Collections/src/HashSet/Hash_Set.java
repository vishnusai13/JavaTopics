package HashSet;
import java.util.LinkedHashSet;
public class Hash_Set {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(12);
		hs.add(0);
		
		hs.add(100);
		hs.add(1000);
		hs.add(91);
		
		LinkedHashSet<Integer> hs1 = new LinkedHashSet<>();
		System.out.println("HS1 : "+hs1);
		hs1.addAll(hs);
		System.out.println("HS1 : "+hs1);
		hs1.add(20);
		hs1.add(48);
		hs1.add(38);
		System.out.println("Updated HS1 : "+hs1);
		hs1.removeAll(hs);
		System.out.println("After removal Hs in HS1 : "+hs1);
		System.out.println("HS1 : "+hs1);
		
		System.out.println("After adding: "+hs);
		hs.remove(1000);
		System.out.println("After Removing: "+hs);
		System.out.println(hs.size());

	}

}