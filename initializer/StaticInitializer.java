public class StaticInitializer{
	private static int y;
	static
	{
		System.out.println("StaticInitializer block : y="+y);
		y=10;
	}
	StaticInitializer(){
		System.out.println("Constructor: y="+y);
	}
}