import java.util.*;
class Example{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("================================");
		System.out.println("Enter size of 2d array");
		int n=scan.nextInt();
		int m=scan.nextInt();
		int [][] arr=new int[n][m];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("================================");
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
			}
		}

		System.out.println("================================");

		int p=3;
		int q=3;
		int [][]a=new int[p][];
		for(int i=0;i<p;i++){
			a[i]=new int [q];
			for(int j=0;j<q;j++){
				a[i][j]=i*p+j;
			}
		}

		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				System.out.println("a["+i+"]["+j+"] = "+a[i][j]);
			}
		}

	}
}