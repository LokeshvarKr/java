
public class Main{
	public class Car{
		double averageMilesPerGallon;
		string licensePlate;
		string paintColor;
		boolean areTaillingWorking;

		public Car(double inputAverageMPG,string inputLicensePlate, 
				string inputPaintColor,boolean inputAreTaillightsWorking){
			this.averageMilesPerGallon=inputAverageMPG;
			this.licensePlate=inputLicensePlate;
			this.paintColor=inputPaintColor;
			this.areTaillingWorking=inputAreTaillightsWorking;
		}
	}
	public static void main(String[] args){
		Car myCar=new Car(25.5,"1BC32E","Blue",true);
		Car sallyCar=new Car(13.9,"3D20BN","Red",false);
		System.out.println("My Car's License Plate: " + myCar.licensePlate);
		System.out.println("Sally Car's License Plate: " + sallyCar.licensePlate);
	}
	
}
