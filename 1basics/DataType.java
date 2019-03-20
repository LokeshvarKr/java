public class DataType{
	
	// byte(number,1 byte)
	// short(number,2 byte)
	// int(number,4 byte)
	// long(number,8 byte)
	// float(float number,4 byte)
	// double(float number,8 byte)
	// char(a character, 2 byte)
	// boolean(true or false, 1 byte)
	
	byte serialNumber=17;
	String rollNumber="m170c64ca";
	short totalMarks=403;
	float sgpa=(float)8.12;
	int tutionFee=45455;
	long yourIdentityNumber=781932832;
	public void print(){
		System.out.println("serialNumber: "+ serialNumber);
		System.out.println("totalMarks: " + totalMarks);
		System.out.println("sgpa: " + sgpa);
		System.out.println("tutionFee: " + tutionFee);
		System.out.println("yourIdentityNumber: " + yourIdentityNumber);
	}
	public static void main(String[] args) {
	
		DataType d=new DataType();
		d.print();
	}
}