package ArrlList;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrListNames {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("vishnu");
		names.add("sai");
		names.add("neelam");
		names.add("yagnesh");
		names.add("Nani");
		
		System.out.println(names);
//		for(String s : names) {
//		if(s.equals("Nani")) { The reason we don't use is: 
//				names.remove(s);// Exception in thread "main" java.util.ConcurrentModificationException
//		}//instead we use this:
//	     	System.out.println(s);
//			
//		}
		Iterator<String> s = names.iterator();
		while(s.hasNext()) {
			String x = s.next();
			if(x.equals("Nani")){
				s.remove();
				
			}
			
		}System.out.println(names);
		
	}

}