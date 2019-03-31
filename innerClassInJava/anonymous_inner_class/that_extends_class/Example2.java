abstract class Hello{
	public abstract void f1();
}

public class Example2{
	public static void main(String[] args) {
		Hello h=new Hello(){
			@Override
			public void f1(){
				System.out.println("This is f1() of anonymous class that extends abstract class Hello ");
			} 
		};

		h.f1();
	}
}