public class Example{
	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1.setRollNumber(100);
		s1.setName("Lokesh");
		s1.setAge(23);

		System.out.println(s1.getName());
		
		System.out.println(s1.getRollNumber());
		
		System.out.println(s1.getAge());
	
	}
}