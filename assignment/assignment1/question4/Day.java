package assignment1.question4;

public class Day {
	private String day;
	static String [] weekday;
	
	//static block
	static {
		weekday=new String [7];
		weekday[0]="SUNDAY";
		weekday[1]="MONDAY";
		weekday[2]="TUESDAY";
		weekday[3]="WEDNESDAY";
		weekday[4]="THRUSDAY";
		weekday[5]="FRIDAY";
		weekday[6]="SATURDAY";
	}
	public Day(){
		this.setDay("SUNDAY");
	}
	public Day(String day){
		this.setDay(day);
	}
	public Day(int day){
		if(day <=7 && day >=1) {
			this.day=weekday[day-1];
		}
	}
	public String getDay() {
		return this.day;
	}
	public void setDay(String day) {
		this.day = day.toUpperCase();
	}

}
