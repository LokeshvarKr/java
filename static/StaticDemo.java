class Example{

	//instance variable
	private int x;

	//static variable 
	public static int m=100;
	public int fun1(){
		x=10;
		return x;
	}

	//static function
	public static int func2(){
		return m;
	} 
	
	//static inner class
	static class Test{
		public static String country="India";
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		System.out.println(Example.Test.country);
		Example.m=200;
		System.out.println(Example.m);
	}
}