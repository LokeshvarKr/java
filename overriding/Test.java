class A{
	public void f1(int x){
		System.out.println("in A : x="+x);
	}
	public void f1(int x,int y){
		System.out.println("in A : x="+x+" y="+y);
	}
}

class B extends A{
	//overriding f1(int x) of class A method
	public void f1(int x){
		System.out.println("in B : x="+x);
	}

	//overriding f1(int x,int y) of class A method
	//and overloading f1(int x) of class B method f1(int x) 
	public void f1(int x,int y){
		System.out.println("in B : x="+x+" y="+y);
	}
}

public class Test{
	public static void main(String[] args) {
		
		System.out.println("========by A's object==========");
		A a=new A();
		a.f1(10);
		a.f1(10,20);

		System.out.println("=========by B's object=========");
		B b=new B();
		b.f1(1);
		b.f1(1,2);	
	}
}