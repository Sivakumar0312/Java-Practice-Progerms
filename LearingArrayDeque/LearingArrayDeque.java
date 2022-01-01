package Lesson12;

import java.util.ArrayDeque;

public class LearingArrayDeque {

	public static void main(String[] args) {
		// Array Deque
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(2);
		adq.offer(3);
		adq.offer(5);
		adq.offerLast(4);
		adq.offerFirst(1);

		System.out.println(adq);
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq.poll());
		System.out.println("poll on"+ adq);
		System.out.println(adq.pollFirst());
		System.out.println("pollFirst"+ adq);
		System.out.println(adq.pollLast());
		System.out.println("pollLast"+ adq);

		
		
		

	}

}
