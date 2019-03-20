public class InstanceInitializer{
	private int x;
	{
		System.out.println("InstanceInitializer block : x="+x);
		x=10;
	}
	InstanceInitializer(){
		System.out.println("Constructor: x="+x);
	}
}