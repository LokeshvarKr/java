package assignment2.question1;
public class Student implements  Comparable{
	
	private class DOB{
		private int day;
		private int month;
		private int year;
		
		public DOB(int day,int month, int year){
			this.day=day;
			this.month=month;
			this.year=year;
		}
		public String getDOB() {
			return 	"day=" + day + ", month=" + month + ", year=" + year;
		}
	}
	
	private int rollNumber;
	private String name;
	private DOB dateOfBirth;
	private double attendancePercentage;
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBirth(String dateOfBirth) {
		String [] dob = dateOfBirth.split("\\W+");
		int day=Integer.parseInt(dob[0]);
		int month=Integer.parseInt(dob[1]);
		int year=Integer.parseInt(dob[2]);
		this.dateOfBirth=new DOB(day, month, year);
	}
	public void getDateOfBirth() {
		this.dateOfBirth.getDOB();
	}
	
	public double getAttendancePercentage() {
		return attendancePercentage;
	}

	public void setAttendancePercentage(double attendancePercentage) {
		this.attendancePercentage = attendancePercentage;
	}


	public void PrintDetails() {
		System.out.println("Roll Number = " + rollNumber);
		System.out.println("Name = " + name);
		System.out.println("Date Of Birth = " + dateOfBirth.getDOB());
		System.out.println("Attendance Percentage = " + attendancePercentage);
	}

	//sort in ascending order by rollNumber
	@Override
	public int compareTo(Object student) {
		int compareRollNumber=((Student)student).getRollNumber();
		return this.rollNumber-compareRollNumber;	}
}
