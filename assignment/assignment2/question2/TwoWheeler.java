package assignment2.question2;


public class TwoWheeler extends Vehicle {
	
	private static int autoId;
	private static int rent;

	//static block
	static {
		autoId=0;
		rent=300;
	}
	
	//instance block
	{
		autoId+=1;
	}
	
	public TwoWheeler(String vehicleName) {
		this.vehicleNumber="TW"+String.valueOf(autoId); 
		this.VehicleName=vehicleName;
	}
	
	public int getRent() {
		return rent;
	}
	public static void setRent(int rent) {
		TwoWheeler.rent = rent;
	}
	
	@Override
	public double returnVehicle(){
		Time time=this.getCurrentTime();
		return startTime.calculateHour(time) * rent;
	}
	
	@Override
	public String setForRent(){
		if(this.isAvailable()) {
			this.setstartTime();
			this.setRented(true);
			return vehicleNumber;
		}
		else return null;
	}

	@Override
	public void printDetails() {
		System.out.println("Vehicle Name: "+this.VehicleName);
		System.out.println("vehicle Number: "+this.vehicleNumber);	
		System.out.println("Rented: "+this.isRented());
		System.out.println("Maintained: "+this.isMaintained());
			
	}
}
