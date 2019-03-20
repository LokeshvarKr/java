package assignment2.question1;

import java.util.Scanner;

public class StudentInfoDriverClass {

	public static void main(String[] args) {
		StudentInformationManagementSystem studentInfo=new StudentInformationManagementSystem();
		
		Scanner scan=new Scanner(System.in);
		scan.useDelimiter("\n");
		boolean condition=true;
		boolean persent=false;
		int rollNumber=0;
		Student student;
		
		while(condition==true) {
			System.out.println("1 add new student");
			System.out.println("2 search student");
			System.out.println("3 delete student");
			System.out.println("4 modify student");
			System.out.println("5 get all Students list");
			System.out.println("6 get sorted list");
			System.out.println("7 get student list whose attendance "
					+ "percentage is less than givent attendance percentage");
			System.out.println("8 for quit");
			System.out.println("Enter your choice");
			int choice =Integer.parseInt(scan.next());
			switch(choice){
			case 1:
				student=new Student();
				
				System.out.println("Enter Roll Number (integer)");
				student.setRollNumber(Integer.parseInt(scan.next()));
				System.out.println("Enter Name");
				student.setName(scan.next());
				System.out.println("Enter Date Of Birth(dd/mm/yyyy)");
				student.setDateOfBirth(scan.next());
				System.out.println("Enter Attendance Percentage");
				student.setAttendancePercentage(Double.parseDouble(scan.next()));
				studentInfo.insert(student);
				break;
				
			case 2:
				System.out.println("Enter Roll Number of Student to search");
				rollNumber=Integer.parseInt(scan.next());
				student=studentInfo.search(rollNumber);
				System.out.println("--------------------------------");
				student.PrintDetails();
				System.out.println("--------------------------------");
				break;
			case 3:
				System.out.println("Enter Roll Number of Student to delete");
				rollNumber=Integer.parseInt(scan.next());
				studentInfo.delete(rollNumber);
				break;
			case 4:
				System.out.println("Enter Roll Number of Student to delete");
				rollNumber=Integer.parseInt(scan.next());
				studentInfo.modify(rollNumber);
				break;
			case 5:
				studentInfo.allStudents();
				break;
			case 6:
				studentInfo.sortByRollNumber();
				break;
			case 7:
				System.out.println("Enter Percentage to get student who has less Attendance");
				Double percentage=Double.parseDouble(scan.next());
				studentInfo.StudentHasLessAttendance(percentage);
				break;
			case 8:
				condition=false;
				System.out.println("Thank You");
				break;
			}
			

		}
	}
}
