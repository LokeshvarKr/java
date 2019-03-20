package assignment1.question5;

public class DriveClass {

	public static void main(String[] args) {
		StackLIFO stack=new StackLIFO();
		
		stack.insert(3);
		stack.insert(7);
		stack.insert(5);
		stack.insert(9);
		stack.insert(8);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.delete());
		}

	}

}
