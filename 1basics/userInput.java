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
		System.out.println("Enter a double value");
		int userInputDouble=scan.nextDouble();
		System.out.println("The entered value is ");
		System.out.println(userInputDouble);

		//string
		System.out.println("Enter a string");
		int userInputString=scan.nextLine();
		System.out.println("The entered value is ");
		System.out.println(userInputString);

	}
}