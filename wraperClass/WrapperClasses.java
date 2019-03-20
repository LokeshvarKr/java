public class WrapperClasses{
	public static void main(String[] args) {
		
		//valueOf() ----> static method
		
		//pass parameter as a string
		
		Integer i=Integer.valueOf("123");
		//or can be pass as binary value in case of interge
		Integer j=Integer.valueOf("1010",2);
		
		Double d=Double.valueOf("3.14");
		Character c=Character.valueOf('a');


		//parseXxx() ---> static method
		int a=Integer.parseInt("123");
		float b=Float.parseFloat("12.3");

		//xxxValue() ----> instance variable

		int p=i.intValue();
		double q=d.doubleValue();
		char r=c.charValue();

		System.out.println(p);
		System.out.println(q);
		System.out.println(r);


		// some other concept
		System.out.println("==========wrapped=======");
		Integer intObj=new Integer(10);
		Float floatObj=new Float(10.4);
		Double doubleObj=new Double(12.1);
		Character charObj=new Character('a');

		System.out.println(intObj);
		System.out.println(floatObj);
		System.out.println(doubleObj);
		System.out.println(charObj);

		System.out.println("=========unwrapped=======");
		int l=intObj;
		float m=floatObj;
		double n=doubleObj;
		char k=charObj;

		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(k);
	}
}