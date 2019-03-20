package assignment1.question1;

public class ExampleComplex {

	public static void main(String[] args) {
		Complex c1=new Complex(2,3);
		Complex c2=new Complex(2,4);
		Complex sum=c1.addition(c2);
		Complex sub=c1.subtraction(c2);
		Complex mul=c1.multiplictaion(c2);
		Complex inv=c1.inverse();
		System.out.println("Addition : "+sum.toString());
		System.out.println("Subtraction : "+sum.toString());
		System.out.println("Multiplication : "+sum.toString());
		System.out.println("Inverse : "+sum.toString());

		
	}

}
