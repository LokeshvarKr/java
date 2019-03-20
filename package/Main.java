package mainMethod;
import student.Student;
public class Main{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollNumber(100);
		s1.setName("Lokesh");
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getName());	
	}
}