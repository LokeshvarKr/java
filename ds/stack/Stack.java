class Stack{
	private int [] a;
	private int capacity;
	private int top;


	Stack(){
		this.a=new int[1];
		this.capacity=1;
		this.top=-1;
	}
	Stack(int capacity){
		this.a=new int[capacity];
		this.capacity=capacity
	}

	public int size(){
		return capacity;
	}
	public int top(){
		if(top!=-1){
			return a[top];
		}
		else{
			return Integer.MAX_VALUE;
		}
	}
	private void isFull(){
		if(top==capacity){
			return true;
		}
		else{
			return false;
		}
	}
	private void doubleArraySize(){
		int [] b=new int [2*capacity];
		for(int i=0;i<capacity;i++){
			b[i]=a[i];
			a=null;
			a=b;
		}
	}
	public void push(int data){
		if(isFull()){
			doubleArraySize();
		}
		top+=1;
		a[top]=data;
	}
	public int pop(){
		it(isEmpty()){
			System.out.println("Error:Underflow");
		}
		else{
			return a[top];
			top-=1;
		}
	}

}