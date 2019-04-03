import java.util.*;
class LinkedListExample{
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("hiiiiiiiiiiiiiiii");
		ll.add("hello...............");
		ll.add("hello...world............");
		ll.add(456789);
		ll.add(56789.4567);

		Iterator it=ll.iterator();

		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
}