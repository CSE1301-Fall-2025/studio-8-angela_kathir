package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class SelectAllQuestion extends MultipleChoiceQuestion {
	public int points;
	public SelectAllQuestion(String prompt, String answer, String[] choices, int points) {
		super(prompt, answer, 0, choices);
		points = 0;
	}
	public SelectAllQuestion() {
		super();
		points = 0;
	}
	/**
	 * Returns the amount of points scored by a provided givenAnswer
	 * @param String givenAnswer to check for points
	 */
	public int checkAnswer(String givenAnswer) {
		for (int i = 0; i < choices.length; i++){
			if(answer.equals(choices[i]) == true && answer.equals(givenAnswer) == false) {
				
			} 
			else if (answer.equals(givenAnswer) == false){

			}
			else{
				
			}
		}
		return sum;
	}

	/**
	 * Count the amount of correct answers that are not in the provided givenAnswer
	 * @param givenAnswer
	 * @return int amount of missed correct answers
	 */
	private int findMissingCorrectAnswers(String givenAnswer) {
		String answer = this.getAnswer();
		//how many letters are in the correct answer but not the given answer?
		int incorrectValues = findMissingCharacters(givenAnswer, answer);
		return incorrectValues;
	}
	
	/**
	 * Count the amount of present answers that are not correct
	 * @param givenAnswer
	 * @return int amount of incorrect answers
	 */
	private int findIncorrectGivenAnswers(String givenAnswer) {
		String answer = this.getAnswer();
		//how many letters are in the given answer but not the correct answer?
		int incorrectValues = findMissingCharacters(answer, givenAnswer);
		return incorrectValues;
	}

	/**
	 * Returns the number of characters in toCheck that are missing from the
	 * baseString. For example findMissingValues("hi", "hoi") would return 1,
	 * 'o' is not in the baseString.
	 * 
	 * This method is marked static as it does not depend upon any instance variables
	 */
	private static int findMissingCharacters(String baseString, String toCheck) {
		int missingValues = 0;
		for(int i = 0; i < toCheck.length(); i++) {
			char characterToLocate = toCheck.charAt(i);
			if(baseString.indexOf(characterToLocate) == -1) { //not in baseString
				missingValues++;
			}
		}
		return missingValues;
	}	
	
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		String[] choices = {"1", "2", "3", "4"};
		SelectAllQuestion question = new SelectAllQuestion("What is the answer to 2+2", "4,2", 10, choices);
		question2.displayPrompt();
		String answer = in.nextLine();
		System.out.println(question2.checkAnswer(answer));
	}
}
