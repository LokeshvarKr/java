import java.util.Queue;
import java.util.LinkedList;

class QueueExample{
	public static void main(String[] args) {
		Queue q=new LinkedList();

		q.add("c");
		q.add("c++");
		q.add("java");
		q.add("python");
		q.add(34567);
		q.add(5678.567);
		q.add(true);
		System.out.println("peek() :"+q.peek());
		System.out.println("element() :"+q.element());
		System.out.println("poll :"+q.poll());
		System.out.println();
		while(!q.isEmpty()){
			System.out.println(q.remove());
		}
	}
}