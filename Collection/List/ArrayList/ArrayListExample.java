import java.util.*;
class ArrayListExample{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(5);
		list.add("hello");
		list.add("hi");
		list.add("How are u?");
		list.add("I'm Good");
		list.add("okk fine");
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		System.out.println("=======================================");


		list.set(4,"do u Know me?");
		list.add(0,"hello world");
		for(String s:list){

			System.out.println(s.toString());
		}
		System.out.println("=======================================");


		int size=list.size();
		for (int i=0;i<size;i++){
			System.out.println(list.get(i).toString());
		}



		System.out.println("=======================================");


		//heterogeneous  elements
		ArrayList mixList=new ArrayList(5);
		mixList.add("hello");
		mixList.add(5);
		mixList.add(6.7);
		mixList.add(true);

		size=mixList.size();
		for (int i=0;i<size;i++){
			System.out.println(mixList.get(i).toString());
		}


	}
}