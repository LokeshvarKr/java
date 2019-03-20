class A{
	public A(int x){
		System.out.println("Class A x="+x);
	}
}
class B extends A{

	public B(){
		this(6);
		System.out.println("Class B");
	}

	public B(int x){
		super(x);
		System.out.println("Class B x="+x);
	}
}
class Test{
	public static void main(String[] args) {
		A a=new B();
		B b=new B();
	}
}