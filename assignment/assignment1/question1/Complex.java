package assignment1.question1;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex() {
		this.real=0;
		this.imaginary=0;
	}
	public Complex(double real,double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public double getReal() {
		return real;
	}
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginary() {
		return imaginary;
	}
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	public void printNumber() {
		System.out.println(this.real+" + i"+this.imaginary);
	}
	public Complex addition(Complex c) {
		
		Complex sum =new Complex();
		sum.real=this.real+c.real;
		sum.imaginary=this.imaginary+c.imaginary;
		return sum;
	}
	public Complex subtraction(Complex c) {
		Complex sub =new Complex();
		sub.real=this.real - c.real;
		sub.imaginary=this.imaginary - c.imaginary;
		return sub;
	}
	public Complex multiplictaion(Complex c) {
		Complex mul=new Complex();
		mul.real=this.real*c.real - this.imaginary * c.imaginary;
		mul.imaginary=this.real * c.imaginary + this.imaginary * c.real;
		return mul;
	}
	public Complex inverse() {
		Complex inv=new Complex();
		double denominator=this.real*this.real + this.imaginary*this.imaginary;
		inv.real=this.real / denominator;
		inv.imaginary=- this.imaginary/denominator;
		return inv;
	}
}
