package assignment1.question5;

public class StackLIFO implements Stack {

	private int [] container;
	private int count;
	private int capacity;
	
	StackLIFO(){
		this.container=new int[2];
		this.count=-1;
		this.capacity=2;
	}
	
	private void increaseSize() {
		int [] tempContainer=new int[2*capacity];
		for(int i=0;i<capacity;i++) {
			tempContainer[i]=container[i];
		}
		container=tempContainer;
		capacity*=2;
	}
	public boolean isEmpty() {
		if(count==-1) {
			return true;
		}
		return false;
	}
	@Override
	public void insert(int item) {
		count+=1;
		if(capacity==count) {
			this.increaseSize();
		}
		container[count]=item;
	}

	@Override
	public int delete() {
		if(!this.isEmpty()) {
			int x=container[count];
			count-=1;
			return x;
		}
		else {
			System.out.println("Error : Underflow");
			return Integer.MIN_VALUE;
		}
	}

	@Override
	public void status() {
		System.out.println("Number of elements Persent in Stack is : "+count);
	}

}
