package assignment2.question2;

public class Renter {
	String name;
	String mobileNumber;
	String address;
	
	public Renter(String name, String mobileNumber, String address) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	
	public String getRenter() {
		return "Renter [name=" + name + ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}
	
}
