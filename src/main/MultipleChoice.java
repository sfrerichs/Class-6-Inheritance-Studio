package main;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    ArrayList<String> multChoices = new ArrayList<>();

    public void answer(String aAnswer) {
        correctAnswer = aAnswer;
    }

    public void answerChoices(String aAnswer) {
        multChoices.add(aAnswer);
    }

    public void grader(String userAnswer, String correctAnswer) {
        if (correctAnswer.toLowerCase().equals(userAnswer.toLowerCase())) {
            System.out.println("Correct!\n");
        } else {
            System.out.println("Incorrect.\n");
        }
    }

    //toString
    @Override
    public String toString() {
        return question + "\n" + multChoices + "\nEnter letter of correct answer: ";
    }


}
