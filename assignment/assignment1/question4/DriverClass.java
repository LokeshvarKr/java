package assignment1.question4;

public class DriverClass {
	public static void main(String [] args) {
		DayList list=new DayList();
		Day d1=new Day();
		Day d2=new Day("friday");
		Day d3=new Day("saturday");
		Day d4=new Day("monday");
		list.addDay(d1);
		list.addDay(d2);
		list.addDay(d3);
		list.addDay(d4);
		list.showAllDays();
	}

}
