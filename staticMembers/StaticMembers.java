class A{
	static int x;
	static{
		x=10;
	}
	//static method
	public static void f1(){
		System.out.println("class A f1() :x="+x);
	}
	 public void f2(){
		System.out.println("class A f2() :x="+x);
	 }
}
class B extends A{

	static{
		x=20;	
	}

	//in case of hiding function signature should be same 
	public static void f1(){
		System.out.println("class B f1(): x="+x);
		
	}
	
	//but is is overloading (as function signature is different)
	public void f1( int x){
		System.out.println("class B f1(): x="+x);
		
	}
	//this is method overriding (of f2())
	 public void f2(){
		System.out.println("class B f2() :x="+x);
	 }
	public void f2(int x){
		System.out.println("class B f2() :x="+x);
	}
}

class StaticMembers{
	public static void main(String[] args) {
		//internally B.x converted into A.x becase no B's object is present 
		System.out.println("x="+B.x); 
		A a=new A();
		a.f1();
		a.f2();
		System.out.println("============================");
		A aa=new B();
		aa.f1(); 
		aa.f2();
		//aa.f1(100);
		//aa.f2(100);
		System.out.println("============================");
		B b=new B();
		System.out.println("x="+B.x);
		B.f1();
		b.f1(100);
		b.f2();
		b.f2(100);
	}
}