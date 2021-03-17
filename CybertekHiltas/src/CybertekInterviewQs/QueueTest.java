package CybertekInterviewQs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue q = new LinkedList();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		System.out.println(q.size());
		
		System.out.println(q.isEmpty());
		
		
		Deque dq = new LinkedList();
		
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		
		System.out.println(dq);
		
		System.out.println(dq.peek());
		
		System.out.println(dq.size());
		
		System.out.println(dq.isEmpty());
		
		System.out.println();
System.out.println(" *  *   **");
System.out.println(" *  *     ");
System.out.println(" *  *   **");
System.out.println(" ****   **");
System.out.println(" *  *   **");
System.out.println(" *  *   **");
System.out.println(" *  *   **");


	}

}
