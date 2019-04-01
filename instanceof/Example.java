class Complex{
	private double  real;
	private double imaginary;

	Complex(double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}

	@Override
	public boolean equals(Object obj){

		if(obj==this){
			return true;
		}
		//use of instanceof operator
		if(!(obj instanceof Complex)){
			return false;
		}

		Complex com=(Complex)obj;
		if(this.real==com.real && this.imaginary==com.imaginary){
			return true;
		}
		
		return false;

	}

}

public class Example{
	public static void main(String[] args) {
		
		Complex com1=new Complex(2,3); 
		Complex com2=new Complex(3,2); 
		Complex com3=new Complex(2,3);

		if(com1.equals(com2)){
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}


		if(com1.equals(com3)){
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}

	}
}
