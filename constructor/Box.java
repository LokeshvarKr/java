public class Box{
	private int l,b,h;
	public Box(int l,int b,int h){
		this.l=10;this.b=20;this.h=30;
		System.out.println("constructor");
	}
	//when we don't write constructor of a class
	//then bydefault compiler will create the constructor
	//constructor by complier is --> public Box(){ }
	
	public Box(){
		l=10;b=20;h=30;
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box(2,4,8);
	}
}