import java.util.Scanner;
class Student{
	private String name;
	private String rollNumber;
	private double cgpa;

	public Student(String name,String rollNumber,double cgpa){
		this.name=name;
		this.rollNumber=rollNumber;
		this.cgpa=cgpa;
	}
	private double getPercentage(){
		return 9.5*cgpa;
	}

	public void printDetails(){
		double percentage=getPercentage();
		System.out.println(name+" "+rollNumber+" "+cgpa+" "+percentage);
	}
}

class CgpaToPercentage{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number of students");
		int n=scan.nextInt();
		Student[] s = new Student[n];
		int i=0;
		while(i<n){
			String name=scan.next();	
			String rollNumber=scan.next();
			double cgpa=scan.nextDouble();
			s[i] = new Student(name,rollNumber,cgpa);
			i++;
		}
		i=0;
	 	while(i<n){
	 		s[i].printDetails();
	 		i++;
	 	}
	}
}