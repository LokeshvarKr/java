interface Outer{
	interface Inner{
		void method();
	}
}

class Test implements Outer.Inner{

	@Override 
	public void method(){
		System.out.println("hello Inner interface");
	}
	public static void main(String[] args) {
		Outer.Inner test=new Test();
		test.method();
	}
}
