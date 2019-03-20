package assignment1.question4;

public class DayList {
	private Day [] dayList;
	private int increment;
	private int count;
	private int capacity;
	public DayList(){
		this.dayList=new Day[2];
		this.increment=0;
		this.count=-1;
		this.capacity=2;
	}
	public DayList(int numberOfDays) {
		this.dayList=new Day[numberOfDays];
		this.increment=0;
		this.count=-1;
		this.capacity=numberOfDays;
	}
	public DayList(int numberOfDays,int increment) {
		this.dayList=new Day[numberOfDays];
		this.increment=increment;
		this.count=-1;
		this.capacity=numberOfDays;
	}
	private void  increaseListSize() {
		if(this.capacity==0 && increment ==0) {
			this.capacity=2;
			this.dayList=new Day[2];
		}
		else if(capacity!=0 && increment==0){
			Day [] tempDayList=new Day[2 * this.capacity];
			for(int i=0;i<dayList.length;i++) {
				tempDayList[i]=this.dayList[i];
			}
			this.capacity*=2;
			this.dayList=tempDayList;
		}
		else if(this.increment!=0){
			Day [] tempDayList=new Day[this.capacity+this.increment];
			for(int i=0;i<this.dayList.length;i++) {
				tempDayList[i]=this.dayList[i];
			}
			this.capacity+=this.increment;
			this.dayList=tempDayList;
		}
		
	}
	
	/*
	private void decreaseListSize() {
	
	}
	*/
	
	public void addDay(Day day){
		count+=1;
		if(this.capacity == this.count){
			this.increaseListSize();
		}
		this.dayList[count]=day;
	}
	public void showAllDays() {
		for (int i=0;i<=count;i++) {
			System.out.println(dayList[i].getDay());
		}
	}
}
