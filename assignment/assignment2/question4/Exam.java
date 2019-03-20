package assignment2.question4;

import java.util.ArrayList;

public abstract class Exam {
	protected static ArrayList<Question> easyQuestionList;
	protected static ArrayList<Question> mediumQuestionList;
	protected static ArrayList<Question> hardQuestionList;
	
	static {
		easyQuestionList= new ArrayList<Question>();
		mediumQuestionList =new ArrayList<Question>();
		hardQuestionList =new ArrayList<Question>();
		
	}
	
	//abstract method
	public abstract void conductExam(int totalQuestionNumber);

	protected static void addQuestions(Question question) {
		
		if(question.getQuestionLevel().equalsIgnoreCase("EASY")) {
			easyQuestionList.add(question);
		}
		else if(question.getQuestionLevel().equalsIgnoreCase("MEDIUM")) {
			mediumQuestionList.add(question);
		}
		else if(question.getQuestionLevel().equalsIgnoreCase("HARD")) {
			hardQuestionList.add(question);
		}
		else {
			System.out.println("Error! Check Question Details");
		}
	}
	
	public void getDetails() {
		
		System.out.println("Number of easy que :"+easyQuestionList.size());
		System.out.println("Number of medium que :"+easyQuestionList.size());
		System.out.println("Number of hard que :"+easyQuestionList.size());
	}
	
}
