class Hello{
	public void f1(){
		System.out.println("This is f1() of Hello");
	} 
}

public class Example1{
	public static void main(String[] args) {
		Hello h=new Hello(){
			@Override
			public void f1(){
				System.out.println("This is f1() of anonymous class that extends Hello class");
			} 
		};

		h.f1();
	}
}