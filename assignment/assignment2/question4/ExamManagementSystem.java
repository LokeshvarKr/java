package assignment2.question4;
import java.util.Random;
import java.util.Scanner;

public class ExamManagementSystem {

	
	public static void main(String[] args) {
		boolean condition1=true;
		boolean condition2=true;
		int NumberOfQuestion=0;
		Exam exam;
		Scanner scan=new Scanner(System.in);
		scan.useDelimiter("\n");
		while(condition1==true) {
			System.out.println("1 for add Question");
			System.out.println("2 for Moderate Exam");
			System.out.println("3 for Difficult Exam");
			System.out.println("4 for Exit");
			int choice1=0;
			condition2=true;
			while(condition2) {
				try {
					choice1=scan.nextInt();
					condition2=false;
				}
				catch(Exception e) {
					System.out.println("Enter correnct Option");
				}
			}
			
			
			switch(choice1) {
			case 1:
				condition2=true;
				while(condition2==true) {
					System.out.println("1 add Easy Question");
					System.out.println("2 add Medium Question");
					System.out.println("3 add Hard Question");
					System.out.println("4 Go to Main Menu");
					int choice2=0;
					boolean condition3=true;
					while(condition3==true){
						try {
							choice2=scan.nextInt();
							condition3=false;
						}
						catch(Exception e) {
							System.out.println("Enter correnct Option");
						}
					}
					Question question=null;
					Random rand=null;
					int option=0;
					String questionLevel=null;
					
					switch(choice2) {
					case 1:
						question=new Question("The Question is ...");
						rand=new Random();
						option=rand.nextInt(4)+1;
						questionLevel="EASY";
						question.setOption(option);
						question.setQuestionLevel(questionLevel);
						Exam.addQuestions(question);
						break;
					case 2:
						question=new Question("The Question is ...");
						rand=new Random();
						option=rand.nextInt(4)+1;
						questionLevel="MEDIUM";
						question.setOption(option);
						question.setQuestionLevel(questionLevel);
						Exam.mediumQuestionList.add(question);
						break;
					case 3:
						question=new Question("The Question is ...");
						rand=new Random();
						option=rand.nextInt(4)+1;
						questionLevel="HARD";
						question.setOption(option);
						question.setQuestionLevel(questionLevel);
						Exam.hardQuestionList.add(question);
						break;
					case 4:
						condition2=false;
						break;
					default:
						condition2=false;
						break;
					}
				}
				
				break;
				
			case 2:
				exam=new ModerateExam();
				NumberOfQuestion=0;
				condition2=true;
				while(condition2==true) {
					try {
						NumberOfQuestion=Integer.parseInt(scan.next());
						if(NumberOfQuestion<=0) {
							throw new Exception("Enter +ve Integer Number");
						}
						condition2=false;
						exam.conductExam(NumberOfQuestion);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;
				
			case 3:
				exam=new DifficultExam();
				NumberOfQuestion=0;
				condition2=true;
				while(condition2==true) {
					try {
						NumberOfQuestion=scan.nextInt();
						if(NumberOfQuestion<=0) {
							throw new Exception("Enter +ve Integer Number");
						}
						condition2=false;
						exam.conductExam(NumberOfQuestion);
					}
					catch(Exception e) {
						System.out.println("Enter +ve integer Number");
					}
				}
				
				break;
				
			case 4:
				condition1=false;
				System.out.println("Thank you");
				break;
			default:
				condition1=false;
				System.out.println("Thank you");
				break;
			}
		}

	}

}
