
	// not constructor present in Interfaces
	// because it has no instance variable 
	// it has only one type variable by default 
	//i.e, public static final data_type data_name
	//by default all functions are public in Interface
	
interface I1{
	void f1();

}
interface I2{
	void f2();
}

class A implements I1,I2 {
	

	public A(){
		System.out.println("Class A");
	}

	public void f1(){
		System.out.println("Class A f1()");
	}

	public void f2(){
		System.out.println("Class A f2()");
	}
	
	public void f3(){
		System.out.println("Class A f3()");
	}

}

public class Test{
	public static void main(String[] args) {
		A a=new A();
		a.f1();
		a.f2();
		a.f3();

		I1 i1=new A();
		i1.f1();
		//error --->  i1.f2();
		//error --->  i1.f3();
	}
}