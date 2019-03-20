
package assignment2.question1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class StudentInformationManagementSystem {

	HashMap<Integer,Student> studentList=new HashMap<Integer,Student>();	
	public void insert(Student student) {
		this.studentList.put(student.getRollNumber(), student);
	}
	public Student search(int rollNumber) {
		if(studentList.containsKey(rollNumber)) {
			return studentList.get(rollNumber);
		}
		else {
			return null;
		}
	}
	public void delete(int rollNumber) {
		if(studentList.containsKey(rollNumber)) {
			studentList.remove(rollNumber);
		}
		else {
			System.out.println("Doesn't exist this Roll Number");
		}
	}
	public void modify(int rollNumber){
		Student student=this.search(rollNumber);
		
		if(student==null) {
			System.out.println("This Student Roll Number is not Persent");
			return;
		}
		Scanner scan=new Scanner(System.in);
		scan.useDelimiter("\n");
		System.out.println("1 Modify Name");
		System.out.println("2 Modify Date Of Birth");
		System.out.println("3 Attendance Percentage");
		System.out.println("Enter choice");
		int choice = Integer.parseInt(scan.next());
		switch(choice) {
		case 1:
			System.out.println("Enter Student Name");
			student.setName(scan.next());
			break;
		case 2:
			System.out.println("Enter Student Date of Birth");
			student.setDateOfBirth(scan.next());
			break;
		case 3:
			System.out.println("Enter Student Attendance Percentage");
			student.setAttendancePercentage(Double.parseDouble(scan.next()));
			break;
		}
		
	}
	
	public void allStudents() {
		boolean persent=false;
		System.out.println("====================================");
		for(int  roll: studentList.keySet()) {
				persent=true;
				Student student=studentList.get(roll);
				System.out.println("-----------------------------------");
				student.PrintDetails();
				System.out.println("-----------------------------------");

		}
		
		if(persent==false) {
			System.out.println("List is Empty");
		}
		
		System.out.println("====================================");
	}
	
	@SuppressWarnings("unchecked")
	public void sortByRollNumber() {
		ArrayList<Student> list=new ArrayList<Student>(studentList.values());
		Collections.sort(list);
		boolean persent=false;
		System.out.println("====================================");
		for(Student s: list) {
			persent=true;
			System.out.println("-----------------------------------");
			s.PrintDetails();
			System.out.println("-----------------------------------");

		}
		
		if(persent==false) {
			System.out.println("List is Empty");
		}
		
		System.out.println("====================================");
	}
	
	public void StudentHasLessAttendance(double percentage) {
		ArrayList<Student> list=new ArrayList<Student>(studentList.values());
		boolean persent=false;
		System.out.println("====================================");
		for(Student s: list) {
			if(s.getAttendancePercentage() < percentage) {
				persent=true;
				System.out.println("-----------------------------------");
				System.out.println(s.getName());
				System.out.println(s.getAttendancePercentage());
				System.out.println("-----------------------------------");

			}
		}
		if(persent==false) {
			System.out.println("No one has less attendance than "+percentage+"%");
		}
		System.out.println("====================================");
	}

	

}
