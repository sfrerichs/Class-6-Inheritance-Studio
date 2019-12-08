package main;

public class MultipleChoice extends Question {

    public void answer(String aAnswer) {
        correctAnswer = aAnswer;
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
        return "Enter letter of correct answer: " + question + "\nYour Answer: ";
    }
}
