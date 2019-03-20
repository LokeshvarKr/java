public class Operators{
	/*
	Arithmetic +,-.*,/,%
	shortHand operator +=,-=,*=,/=
	increment decrement (unary operator) ++x,x++,--x,x--
	Bitwise
	Relational
	Logical
	*/

	public static void main(String[] args) {
		int m=6,n=4;
		int r1=m+n;
		int r2=m-n;
		int r3=m*n;
		int r4=m/n; //always give quotient
		double r5=(double)m/n; 
		int r6=m%n;
		System.out.println("Arithmetic");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
	}

}