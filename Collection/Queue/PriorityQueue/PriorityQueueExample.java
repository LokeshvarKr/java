import java.util.*;
class PriorityQueueExample{
	public static void main(String[] args) {
		PriorityQueue <Integer> pq=new PriorityQueue<Integer>();

		pq.add(11);
		pq.add(12);
		pq.add(3);
		pq.add(1);
		pq.add(15);
		pq.add(7);
		while(!pq.isEmpty()){
			System.out.println(pq.poll());

		}

		System.out.println("===========================================");

		pq.add(11);
		pq.add(12);
		pq.add(3);
		pq.add(1);
		pq.add(15);
		pq.add(7);

		Iterator it=pq.iterator();

		while(it.hasNext()){
			System.out.println(it.next());

		}

		System.out.println("===========================================");

		
		while(!pq.isEmpty()){
			System.out.println(pq.remove());

		}
		

		System.out.println("===========================================");

		pq.add(11);
		pq.add(12);
		pq.add(3);
		pq.add(1);
		pq.add(15);
		pq.add(7);
		
		Object [] arr=pq.toArray();

		for(Object o:arr){
			System.out.println(o.toString());
		}

		System.out.println("===========================================");


	}
}