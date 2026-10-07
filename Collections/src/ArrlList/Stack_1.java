package ArrlList;

import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack();
		s.push("karthik");
		s.push("jessy");
		s.push("sam");
		System.out.println(s);
		s.pop();
		System.out.println(s);
	
		System.out.println(s.peek());
	}

}