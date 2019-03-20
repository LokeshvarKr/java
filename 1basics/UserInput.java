import java.util.Scanner;
public class UserInput{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		//int
		System.out.println("Enter a integer value");
		int userInputInteger=scan.nextInt();
		System.out.println("The entered value is ");
		System.out.println(userInputInteger);

		//double
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter a double value");
		double userInputDouble=scan2.nextDouble();
		System.out.println("The entered value is ");
		System.out.println(userInputDouble);

		//string
		Scanner scan3=new Scanner(System.in);
		System.out.println("Enter a string");
		String userInputString=scan3.nextLine();
		System.out.println("The entered value is ");
		System.out.println(userInputString);

	}
}