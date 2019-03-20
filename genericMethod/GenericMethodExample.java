class A {
	
	public <T1,T2> void printData(T1 data1,T2 data2){
		System.out.println(data1.toString());
		System.out.println(data2.toString());
	}
}
public class GenericMethodExample{
	public static void main(String[] args) {
		A a=new A();
		//T1,T2 only takes userDefine data type (object reference)
		a.printData("lokesh",567);
	}
}