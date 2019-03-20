public class StaticMembers{

	public class Example{
		private int x; //instance variable
		public static int y; //static variable
		public void fun1(){
			// can't be static variable in methods
			// private static int a; =>this is wrong(error) 
		}
		public static void func2(){
			//only excess static variable
			// x=5 this is error
			y=10;
			System.out.println("in fun2 "+y); 
		}
		public static class Test{
			public static String country="INDIA";
		}

	}

	public static void main(String[] args){
		//Example ex1=new Example()
		Example.fun2();
		fun2();
		Example.y=20;
		System.out.println(Example.y);
		y=30;
		System.out.println(y);

		System.out.println(Example.Test.country);
		Example.Test.country="india";
		System.out.println(Example.Test.country);

	}
}