package assignment2.question4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ModerateExam extends Exam {
	private double marks;
	private int attempted;
	private int wrong;
	private int right;
	private int totalQuestionNumber;
	public ModerateExam(){
		this.marks = 0;
		this.attempted=0;
		this.wrong=0;
		this.right=0;
		this.totalQuestionNumber=0;
	}
	private void result() {
		System.out.println("==========================================");
		System.out.println("Your Result is Here");
		System.out.println("Total Number of Questions : "+totalQuestionNumber);
		System.out.println("Number of Questions Attempted : "+attempted);
		System.out.println("Number of Wrong Answer : "+wrong);
		System.out.println("Number of Right Answer : "+right);
		System.out.println("Total Number of Marks : "+marks);
		System.out.println("==========================================");
	}
	private void showQuestionList(String level,int qnumber) {
		Scanner scan=new Scanner(System.in);
		scan.useDelimiter("\n");
		int n=0;
		ArrayList<Question> tempQuestionList=null;
		if(level.equalsIgnoreCase("EASY")){
			n=Exam.easyQuestionList.size();
			tempQuestionList=Exam.easyQuestionList;
		}
		if(level.equalsIgnoreCase("MEDIUM")){
			n=Exam.mediumQuestionList.size();
			tempQuestionList=Exam.mediumQuestionList;
		}
		boolean [] a=new boolean[n];
		for(int i=0;i<n;i++) {
			a[i]=false;
		}
		Random rand=new Random();
		for(int i=0;i<qnumber;i++) {
			Question question=null;
			boolean condition=true;
			int index=-1;
			while(condition==true) {
				index=rand.nextInt(n);
				if(a[index]==false) {
					condition=false;
				}
			}
			question=tempQuestionList.get(index);
			System.out.println("----------------------------------------");
			System.out.println("Question : "+question.getQuestion());
			System.out.println("Options : (1),(2),(3), (4), (5 if you don't attempt)");
			System.out.println("----------------------------------------");
			System.out.println("Choose one of the given options");
			boolean done=false;
			int option=0;
			while(done==false){
				try {
					option=Integer.parseInt(scan.next());
					if(option <=0 && option >5){
						throw new Exception("please enter integer value between 1 to 5");
					}
					done=true;
				}
				catch(Exception e) {
					System.out.println("please enter integer value between 1 to 5 ");
				}
			}
			if(option==5) {
				continue;
			}
			else {
				this.attempted+=1;
				if(option==question.getOption()) {
					right+=1;
				}
				else {
					wrong+=1;
				}
			}
		}
	}
	
	
	@Override
	public void conductExam(int totalQuestionNumber) {
		if(totalQuestionNumber >=2 && (totalQuestionNumber/2) <= Exam.easyQuestionList.size() 
				&& (totalQuestionNumber/2) <= Exam.mediumQuestionList.size()){	
			this.totalQuestionNumber=totalQuestionNumber;
			
			System.out.println("==========================================");
			System.out.println("Moderate Exam Instruction : ");
			System.out.println("Please Enter Intege value as Option Of Questions");
			System.out.println("Otherwise exam session can be aborted");
			
			String level="EASY";
			int qnumber=totalQuestionNumber/2;
			this.showQuestionList(level,qnumber);
			
			level="MEDIUM";
			this.showQuestionList(level,qnumber);
			
			System.out.println("==========================================");
			this.marks=right*1-wrong*(0.25);
			this.result();
		}
		else {
			System.out.println("Error! That much Questions is Not Persent");
		}
	}

}
