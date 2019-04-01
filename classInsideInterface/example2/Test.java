
//if we define class inside interface compiler will create static class

interface Outer{
	public default void outerMethod1(){
		System.out.println("default interface method : OuterMethod() ");
	}
	class Inner{
		private int x;
		private int y;
		Inner(){
			x=10;
			y=20;
		}
		public void InnerMethod(){
			System.out.println("inner class method inside interface : InnerMethod() x:"+x+" y:"+y);
		}

	}

	public default void outerMethod2(){
		Inner i=new Inner();
		i.InnerMethod();

	}

}


class Test implements Outer {

	public static void main(String[] args) {
		Test t=new Test();
		t.outerMethod1();
		t.outerMethod2();
	}

}