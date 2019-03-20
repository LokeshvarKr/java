class Student{
	private int rollNumber;
	private String name;

	public void setData(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
	}
}
class A <T1,T2> {

	//T1,T2 only takes userDefine data type (object reference)
	
	private T1 data1;
	private T2 data2;
	public void setData(T1 data1,T2 data2){
		this.data1=data1;
		this.data2=data2;
	}
	public void printData(){
		System.out.println(data1.toString());
		System.out.println(data2.toString());
	}
}
public class GenericClassExample{
	public static void main(String[] args) {

		//T1,T2 only takes userDefine data type (object reference)
		
		A <String,Integer> a1=new A<String ,Integer>();
		a1.setData("lokesh",567);
		a1.printData();
		
		System.out.println("================================");

		A <Student,Integer> a2=new A<Student,Integer>();
		Student s1=new Student();
		s1.setData(121,"lokesh");
		a2.setData(s1,0);
		a2.printData(); 
	}
}