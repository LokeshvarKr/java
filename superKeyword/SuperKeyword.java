class A{
	int x;
	public void f1(){
		System.out.println("Class A f1()");
	}
}
class B extends A{
	int x;
	public void f1(){
		System.out.println("Class B f1()");
		// how to call f1() of parent class A 
		// simply calling f1() ?
		// no this lead to infinite
		//reccursion call of f1() of same class B
		//so for this we have of "super" keyword
		//i.e, we have 'super' keyword 
		//to access super class members which are 
		//overriden in child class
		super.f1();
	}

	public void f2(){
		int x;
		x=10;
		this.x=20;
		super.x=30;
		System.out.println(" x of class A : x="+super.x);
		System.out.println(" x of class B : x="+this.x);
		System.out.println(" x of f2() of class B : x="+x);
	}
}
class SuperKeyword{
	public static void main(String[] args) {
		B b=new B();
		b.f1();
		b.f2();
	}
}