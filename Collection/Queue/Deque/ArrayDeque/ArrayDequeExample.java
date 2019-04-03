import java.util.ArrayDeque;
class ArrayDequeExample{
	public static void main(String[] args) {
			
		ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);

		for(Integer i : dq){
			System.out.println(i);
		}
		
		System.out.println("===============================================");
		
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addFirst(3);



		dq.addLast(100);
		dq.addLast(200);
		dq.addLast(300);

		for(Integer i : dq){
			System.out.println(i);
		}


	}
}