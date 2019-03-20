class A{
	public A(){
		System.out.println("class A");
	}
	public A(int x){
		System.out.println("class A x="+x);	
	}
}
class B extends A{
	public B(){
		super(5);
		System.out.println("class B");
	}
}
class ConstructorInInheritance{
	public static void main(String[] args) {
		B b=new B();
	}
}