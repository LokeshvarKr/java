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
		public void innerMethod(){
			System.out.println("inner class method inside interface : InnerMethod() x:"+x+" y:"+y);
		}

	}

	public default void outerMethod2(){
		Inner i=new Inner();
		i.innerMethod();

	}

}


class Demo extends Outer.Inner{

	public static void main(String[] args) {
		Demo d=new Demo();
		d.innerMethod();

		Outer.Inner i=new Outer.Inner();
		i.innerMethod();
	}

}