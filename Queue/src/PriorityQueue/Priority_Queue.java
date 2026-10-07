package PriorityQueue;

import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(45);
		pq.add(50);
		pq.add(55);
		pq.add(60);
		pq.add(65);
		pq.add(70);
		pq.add(75);
		pq.add(80);
		
		System.out.println(pq);
		
		System.out.println("After Adding: "+pq);
		pq.add(45);
		
		System.out.println("After offering: "+pq);
		pq.offer(50);
		
		System.out.println("After removing: "+pq);
		pq.remove();
		
		pq.poll();
		System.out.println("After poll: "+pq);
		System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println("Size of Queue: "+pq.size());
		System.out.println("Is the queue Empty: "+pq.isEmpty());
		
		
		
	}

}
