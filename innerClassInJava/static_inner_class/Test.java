class Outer{
	private int data;
	static int value;


	static{
		value=1000;
	}


	{
		data=2000;
	}
	// inner class can be public , private ,protected,default
	
	static class Inner{
		private int y; 
		static int  x;
		
		static{
			x=5000;
		}

		{
			y=7000;
		}

		static void staticInnerMethod(){
			System.out.println("class Inner method innerMethod() value = " + value);
			System.out.println("class Inner method innerMethod() x = " + x);
		}

		void innerMethod(){
			System.out.println("class Inner method innerMethod() value = " + value);
			System.out.println("class Inner method innerMethod() x = " + x);
			System.out.println("class Inner method innerMethod() y = " + y);

			//inner static class can not access non-static-varable of outer class 
			//below code will not compile 
			//System.out.println("class Inner method innerMethod() data = " + data);
		}
	}



}

class Test{
	public static void main(String[] args) {

		//1
		Outer.Inner.staticInnerMethod();


		System.out.println("=================================================");

		//2
		Outer.Inner in=new Outer.Inner();
		in.innerMethod();

		
		/*
		//in non static inner class we create object like this 
		
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();
		
		*/

		
	}
}