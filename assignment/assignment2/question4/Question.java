package assignment2.question4;

public final class Question {
	private String question;
	private int option;
	private String questionLevel;
	public Question(String question) {
		this.question = question;
		this.option = 0;
		this.questionLevel ="EASY";
	}
	public Question(String question, int option,String questionLevel) {
		this.question = question;
		this.option = option;
		this.questionLevel =questionLevel;
	}
	void setQuestionLevel(String questionLevel) {
		if(questionLevel.equalsIgnoreCase("EASY")) {
			this.questionLevel ="EASY";
		}
		else  if(questionLevel.equalsIgnoreCase("MEDIUM")) {
			this.questionLevel ="MEDIUM";
		}
		
		else if(questionLevel.equalsIgnoreCase("HARD")) {
			this.questionLevel ="HARD";
		}
		else {
			System.out.println("Error! Question Level is Wrong");
		}
	}
	void setOption(int option) {
		if(option >=1 && option<=4) {
			this.option=option;
		}
		else {
			System.out.println("Error! Question option is Wrong");
		}
	}
	public void  printQuestion() {
		System.out.println("----------------------------------------");
		System.out.println("Question : "+this.question);
		System.out.println("Level : "+this.questionLevel);
		System.out.println("Correct Option : "+this.option);
		System.out.println("----------------------------------------");
	}
	public String getQuestionLevel() {
		return this.questionLevel;
	}
	public String getQuestion() {
		return question;
	}
	
	public int getOption() {
		return option;
	}
	
}