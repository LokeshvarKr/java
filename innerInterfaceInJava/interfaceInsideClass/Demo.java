
class Outer{
	void outerMethod(){
		System.out.println("outer method");
	}
	interface Inner{
		void innerMethod();
	}
}

class Demo implements Outer.Inner{
	@Override
	public void innerMethod(){
		System.out.println("hello Inner interface of class ");
	}
	public static void main(String[] args){
		Outer.Inner demo=new Demo();
		demo.innerMethod();
	}
}

