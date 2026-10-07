package Com.Map;
import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(13, "vishnu");
		hm.put(18, "snehitha");
		hm.put(04, "viha");
		hm.put(19, "Rama");
		
		System.out.println( hm.keySet() );  // only keys are retrived
		System.out.println( hm.values() );  //only values are retrived
		System.out.println( hm.entrySet() ); //Both keys and values are retreieved
		
		
		System.out.println(hm.containsKey("vishnu"));
		
		hm.remove(19);
		hm.remove(18, "viha");
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
	}

}
