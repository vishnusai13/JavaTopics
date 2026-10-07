package ArrlList;



import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(40);
		a.add(50);
		for(int i = 0;i<a.size();i++) {//normal for loop
			System.out.println(a.get(i));
			
		}
		System.out.println("Enhanced for loop: ");//enhanced for loop
		for(Integer n:a) {
			
			System.out.println(n);
			
		}
		System.out.println(a.size());
		System.out.println(a);
		
		System.out.println(a.get(3));
		a.set(3, 60);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		System.out.println(a.size());
		
		
	
	}

}