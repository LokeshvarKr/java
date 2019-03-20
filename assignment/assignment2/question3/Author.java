package assignment2.question3;

public class Author {
	private String firstName;
	private String lastName;
	private String emailId;
	private String address;
	
	public Author(String firstName, String lastName, String emailId, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String autherDetails() {
		return "[ firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", address="
				+ address + "]";
	}
	public void printAuther() {
		System.out.println("First Name : "+this.getFirstName());
		System.out.println("Last Name : "+this.getLastName());
		System.out.println("Email Id : "+this.getEmailId());
		System.out.println("Address : "+this.getAddress());
	}
	
}
