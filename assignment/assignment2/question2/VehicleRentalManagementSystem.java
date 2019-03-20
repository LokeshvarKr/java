package assignment2.question2;

import java.util.HashMap;
import java.util.Scanner;

public class VehicleRentalManagementSystem {

	public static void main(String[] args) {
		
		
		HashMap<String , Vehicle> vehicleList=new HashMap<String , Vehicle>();
		
		boolean condition=true;
		Scanner scan=new Scanner(System.in);
		scan.useDelimiter("\n");
		String vehicleName="";
		String vehicleNumber="";
		boolean conform=false;
		Vehicle vehicle=null;
		double bill=0;
		while(condition) {
			System.out.println("1 Insert Bicycle");
			System.out.println("2 Insert Two-Wheeler");
			System.out.println("3 Insert Four-Wheeler");
			System.out.println("4 get Bicycle for Rent");
			System.out.println("5 get Two-Wheeler for Rent");
			System.out.println("6 get Four-Wheeler for Rent");
			System.out.println("7 return Bicycle");
			System.out.println("8 return Two-Wheeler");
			System.out.println("9 return Four-Wheeler");
			System.out.println("10 get List of All Vehicle");
			System.out.println("11 quit");
			
			int choice = Integer.parseInt(scan.next());
			switch(choice){
			case 1:	
				System.out.println("Enter Bicycle Vehicle Name");
				vehicleName=scan.next();
				vehicle=new Bicycle(vehicleName);
				vehicleList.put(vehicle.vehicleNumber,vehicle);
				break;
			case 2:
				System.out.println("Enter Two-Wheeler Vehicle Name");
				vehicleName=scan.next();
				vehicle=new TwoWheeler(vehicleName);
				vehicleList.put(vehicle.vehicleNumber,vehicle);
				break;
			case 3:
				System.out.println("Enter Four-Wheeler Vehicle Name");
				vehicleName=scan.next();
				vehicle=new FourWheeler(vehicleName);
				vehicleList.put(vehicle.vehicleNumber,vehicle);
				break;
			case 4:
				conform=false;
					for(String vNumber:vehicleList.keySet()) {
						vehicle=vehicleList.get(vNumber);
						if(vehicle instanceof Bicycle && vehicle.isAvailable()) {
							vehicleNumber=vehicle.setForRent();
							if(vehicleNumber!=null) {
								conform=true;
							}
						}
					}
					if(conform) {
						System.out.println("Bicycle Number "+vehicleNumber +" is Rented Successfully ");
					}
					else {
						System.out.println("Sorry No Bicycle is Available Now");
					}
					System.out.println();

				break;
			case 5:
				conform=false;
				for(String vNumber:vehicleList.keySet()) {
					vehicle=vehicleList.get(vNumber);
					if(vehicle instanceof TwoWheeler && vehicle.isAvailable()) {
						vehicleNumber=vehicle.setForRent();
						if(vehicleNumber!=null) {
							conform=true;
						}
					}
				}
				if(conform) {
					System.out.println("TwoWheeler Number "+vehicleNumber +" is Rented Successfully ");
				}
				else {
					System.out.println("Sorry No TwoWheeler is Available Now");
				}
				System.out.println();

				break;
			case 6:
				conform=false;
				for(String vNumber:vehicleList.keySet()) {
					vehicle=vehicleList.get(vNumber);
					if(vehicle instanceof FourWheeler && vehicle.isAvailable()) {
						vehicleNumber=vehicle.setForRent();
						if(vehicleNumber!=null) {
							conform=true;
						}
					}
				}
				if(conform) {
					System.out.println("Fourwheeler Number "+vehicleNumber +" is Rented Successfully ");
				}
				else {
					System.out.println("Sorry No fourWheeler is Available Now");
				}
				System.out.println();
				break;
			case 7:
				System.out.println("Enter Bicycle Vehicle Number");
				vehicleNumber=scan.next();
				conform=false;
				for(String vNumber:vehicleList.keySet()) {
					if(vNumber.equalsIgnoreCase(vehicleNumber)){
						vehicle=vehicleList.get(vNumber);
						if(vehicle instanceof Bicycle) {
							bill=vehicle.returnVehicle();
							conform=true;
						}
					}
				}
				
				if(conform){
					System.out.println("Bicycle Number "+vehicleNumber +" returned Successfully ");
					System.out.println("Please Pay : "+bill);
				}
				else {
					System.out.println("Not fount this Bicycle!");
					System.out.println("Enter correct Bicycle Number");
				}
				break;
			case 8:
				System.out.println("Enter Two-Wheeler Vehicle Number");
				vehicleNumber=scan.next();
				conform=false;
				for(String vNumber:vehicleList.keySet()) {
					if(vNumber.equalsIgnoreCase(vehicleNumber)){
						vehicle=vehicleList.get(vNumber);
						if(vehicle instanceof TwoWheeler) {
							bill=vehicle.returnVehicle();
							conform=true;
						}
					}
				}
				
				System.out.println("---------------------------------");
				if(conform){
					System.out.println("Two-Wheeler Number "+vehicleNumber +" returned Successfully ");
					System.out.println("Please Pay : "+bill);
				}
				else {
					System.out.println("Not fount this Two-Wheeler!");
					System.out.println("Enter correct Two-Wheeler Number");
				}
				System.out.println("---------------------------------");

				break;
			case 9:
				System.out.println("Enter Four-Wheeler Vehicle Number");
				vehicleNumber=scan.next();
				conform=false;
				for(String vNumber:vehicleList.keySet()) {
					if(vNumber.equalsIgnoreCase(vehicleNumber)){
						vehicle=vehicleList.get(vNumber);
						if(vehicle instanceof FourWheeler) {
							bill=vehicle.returnVehicle();
							conform=true;
						}
					}
				}
				
				System.out.println("---------------------------------");
				if(conform){
					System.out.println("Four-Wheeler Number "+vehicleNumber +" returned Successfully ");
					System.out.println("Please Pay : "+bill);
				}
				else {
					System.out.println("Not fount this Four-Wheeler!");
					System.out.println("Enter correct Four-Wheeler Number");
				}
				System.out.println("---------------------------------");

				break;
			case 10:
				conform=false;
				System.out.println("=======================================");
				for(String vNumber:vehicleList.keySet()) {
					conform=true;
						vehicle=vehicleList.get(vNumber);
						System.out.println("---------------------------------");
						vehicle.printDetails();
						System.out.println("---------------------------------");
					}
				if(conform==false){
					System.out.println("List is Empty");
				}
				System.out.println("=========================================");
			break;
			case 11:
				condition=false;
				System.out.println("Thank you");
				break;
			default:
				condition=false;
				System.out.println("Thank you");
				break;
			}
		}

	}

}
