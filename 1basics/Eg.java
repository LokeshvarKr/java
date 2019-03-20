

			class Box{
					private int length,breadth,height;
					public void setDimension(int l,int b,int h){
						this.length=l;
						this.breadth=b;
						this.height=h;
					}
					public void showDimention(){
						System.out.println("L "+length);
						System.out.println("H "+height);
						System.out.println("L "+breadth);
					}
				}

				public class Eg{
					public static void main(String args[]){
						Box b1=new Box();
						b1.setDimension(10,11,12);
						b1.showDimention();
					}
				}