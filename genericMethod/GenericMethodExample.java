class A {
	
	public <T1,T2> void printData(T1 data1,T2 data2){
		System.out.println(data1.toString());
		System.out.println(data2.toString());
	}

	public <T1,T2> T1 getFirst(T1 data1 , T2 data2){
		return data1;
	}

	public <T1,T2> T2 getSecond(T1 data1 , T2 data2){
		return data2;
	}
}
public class GenericMethodExample{
	public static void main(String[] args) {
		A a=new A();
		//T1,T2 only takes userDefine data type (object reference)
		a.printData("lokesh",567);

		String first=a.getFirst("lokesh",345);
		System.out.println("first:"+first);

		int second=a.getSecond("lokesh",345);
		System.out.println("second:"+second);
	}
}