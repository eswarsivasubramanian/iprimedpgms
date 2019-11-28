package collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(5);
		pq.add(1);
		pq.add(2);
		System.out.println(pq);
		pq.remove();//removes least element in queue
		System.out.println(pq);
		

	}

}
