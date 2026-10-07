package PriorityQueue;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.add(25);
		dq.add(35);
		dq.add(12);
		dq.add(22);
		dq.add(49);
		dq.add(45);
		dq.addFirst(35);
		dq.addLast(75);
		dq.remove();
		dq.removeFirst();
		dq.removeLast();
		
		
		dq.offerFirst(43);
		dq.offerLast(44);
		
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		System.out.println(dq.element());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
	}

}
