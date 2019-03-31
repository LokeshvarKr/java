class Outer{
	private int data;
	// inner class can be public , private ,protected,default
	
	//constructor
	public Outer(){
		this.data=50;
	}

	void outerMethod(){
		int x=1000;

		class Inner{
			void innerMethod(int y){
				System.out.println("class Inner method innerMethod() data = " + data);
				System.out.println("class Inner method innerMethod() x = " + x);
				System.out.println("class Inner method innerMethod() y = " + y);
			}
		}

		Inner in = new Inner();
		in.innerMethod(100);
	}


}

class Test{
	public static void main(String[] args) {
		Outer out=new Outer();
		out.outerMethod();
	}
}