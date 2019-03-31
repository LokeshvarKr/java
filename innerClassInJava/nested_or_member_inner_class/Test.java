class Outer{
	private int data;
	static int value;


	static{
		value=100;
	}


	{
		data=1000;
	}
	// inner class can be public , private ,protected,default
	
	class Inner{
		private int  x;

		public Inner(){
			x=2000;
		}

		void innerMethod(){
			System.out.println("class Inner method innerMethod() data = " + data);
			System.out.println("class Inner method innerMethod() value = " + value);
			System.out.println("class Inner method innerMethod() x = " + x);
			}
		}

	}

class Test{
	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();

		in.innerMethod();
	}
}