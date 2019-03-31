
interface Age{
	public int x=21;
	public int getAge();
}
public class Test {
	public static void main(String[] args){
		Age a=new Age(){
			public int getAge(){
				return x;
			}
		};
		System.out.println("Age is : "+a.getAge());
	}
}