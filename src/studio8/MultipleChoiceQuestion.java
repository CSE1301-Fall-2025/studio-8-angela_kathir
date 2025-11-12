package studio8;
import java.util.Scanner;
import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	public String[] choices;

	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;
	}
	public MultipleChoiceQuestion(){
		super();
		this.choices = null;
	}
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + "(" + this.points + " points)");
		for (int i = 0; i < choices.length; i++){
			System.out.println(i+1 + ". " + choices[i]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] choices = {"1", "2", "3", "4"};
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What is the answer to 2+2", "4", 10, choices);
		question2.displayPrompt();
		String answer = in.nextLine();
		System.out.println(question2.checkAnswer(answer));
	}
}
