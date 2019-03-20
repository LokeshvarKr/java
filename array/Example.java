import java.util.*;
class Example{
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println("a["+i+"] = "+arr[i]);
		}
	}
}