package assignment2.question2; 
import java.time.LocalDateTime;
import java.lang.Math;
abstract class Vehicle{
	
	protected class Time{
		private int hour;
		private int minute;
		public Time(){
			this.hour =0;
			this.minute =0;
		}
		public void setTime(int hour,int minute){
			this.hour=hour;
			this.minute=minute;
		}
		public double calculateHour(Time time){
			return (Math.abs(time.hour-this.hour) + Math.abs(time.minute-this.minute)*(1/60));
		}
	}
	
	protected String VehicleName;
	protected Time startTime;
	private boolean rented;
	private boolean maintained;
	public String vehicleNumber;
		
	
	public Vehicle(){
		this.rented=false;
		this.maintained=true;
	}
	//abstract method
	public abstract String setForRent();
	public abstract double returnVehicle();
	public abstract void printDetails();

	public boolean isAvailable() {
		if(!this.rented && this.maintained) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public Time getCurrentTime() {  
		LocalDateTime now = LocalDateTime.now();
		Time t=new Time();
		int hour=now.getHour();
	    int minute=now.getMinute();
	    t.setTime(hour, minute);
		return t;  
	}
	public Time getstartTime() {
		return startTime;
	}
	public void setstartTime() {
		startTime=this.getCurrentTime();
	}
	
	
	public boolean isRented() {
		return this.rented;
	}
	public void setRented(boolean status) {
		this.rented=status;
	}
	public boolean isMaintained() {
		return this.maintained;
	}
	public void setMaintained(boolean status) {
		this.maintained=status;
	}
	
	
}