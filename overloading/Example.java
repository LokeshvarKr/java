class A{
	public void f1(int x){
		System.out.println("in A : x="+x);
	}
	public void f1(int x,int y){
		System.out.println("in A : x="+x+" y="+y);
	}
}

class B extends A{
	public void f1(String name,int age){
		System.out.println("in B : name="+name+" age="+age);
	}
	public void f1(int x,int y,int z){
		System.out.println("in B : x="+x+" y="+y+" z="+z);
	}
}

public class Example{
	public static void main(String[] args) {
		
		System.out.println("========by A's object==========");
		A a=new A();
		a.f1(10);
		a.f1(10,20);

		System.out.println("=========by B's object=========");
		B b=new B();
		b.f1(1);
		b.f1(1,2);
		b.f1("Lokesh",23);
		b.f1(10,20,30);	
	}
}