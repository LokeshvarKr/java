final class Dummy{
	//code goes here 
}
//we can't extends this dummy class further more
//class MoreDummy extends Dummy{} --> this is error

class A{
	public final void f1(){
		System.out.println("class A f1() ");
	}
}
class B extends A{
	//here we can't override f1()
	//but we can overload f1()
	public final void f1(int k){
		System.out.println("class B f1() : k="+k);
	}

	public final void f2(){
		System.out.println("class B f2() ");
	} 
}
class Example{
	private final int x;//final instance variable
	private final static int y;//final static variabl
	//initializing final instance 
	//variable x by instance initializer block
	{
		x=10;
	}
	//initializing final static 
	//variable y by static initializer block
	static 
	{
		y=10;
	}
	
	public int getX(){
		return x;
	}
	public static int getY(){
		return y;
	}
	// for final local variable
	public int getFinalLocalVariable(){
		final int k;
		//now this is blank final local viable 
		//need ot assign before accessing
		//k=k+1 will give error because k is blank 
		//because  this is final local variable so we 
		// can assign only once as this can not be altered
		k=10;
		return k;
	}
}

public class FinalKeyword{
	public static void main(String[] args) {
		Example e1=new Example();
		System.out.println(e1.getX());
		System.out.println(e1.getY());
		System.out.println(Example.getY());

		A a=new A();
		a.f1();
		B b=new B();
		b.f1();
		b.f1(3);
		b.f2();

	}
}
