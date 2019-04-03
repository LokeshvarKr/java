import java.util.Stack;
class StackExample{
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();

		stack.push(6);
		stack.push(7);
		stack.push(11);
		stack.push(1111);

		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}

		System.out.println("============================================");

		Stack s=new Stack();

		s.push("raju");
		s.push(6.11);
		s.push(7);
		s.push(11.12);
		s.push(true);
		s.push("rahul");

		while(!s.isEmpty()){
			System.out.println(s.pop());
		}

	}
}