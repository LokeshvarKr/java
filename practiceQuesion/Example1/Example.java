
class A{
	public A(){
		System.out.println("A");
	}
}

class B {
	public B(){
		System.out.println("B");
	}
}
class C{
	public C(){
		System.out.println("C");
	}
}
class Example extends A{
	B b=new B();
	C c=new C();

	public Example(){
		System.out.println("Example");
	}
	public static void main(String[] args) {
		Example e=new Example();
	}
}