
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
		private String name;
		private String rollNo;
		public void setName(String name){
			this.name=name;
		}
		public void setRollNumber(String rollNo){
			this.rollNo=rollNo;
		}
		public String getName(){
			return name;
		}
		public String getRollNumber(){
			return rollNo;
		}
}

public class Test{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Rahul Kumar");
		s1.setRollNumber("M17983CA");
		Class c1=s1.getClass();
		System.out.println(c1.getName());

		//getting all getting all methods
		Method m[]=c1.getDeclaredMethods();
		for( Method method : m){
			System.out.println(method.getName());
		}

		//getting all fildes in an array 
		Field f[] = c1.getDeclaredFields();
		for( Field field : f){
			System.out.println(field.getName());
		}

		System.out.println(String.class.getClassLoader());
		System.out.println(Test.class.getClassLoader());  

	}
}