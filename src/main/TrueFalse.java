package main;

public class TrueFalse extends Question{

    public void answer(String aAnswer) {
        correctAnswer = aAnswer;
    }

    public void answerChoices(String aAnswer) {
    }

    //accepts t or true and f or false for answers
    public void grader(String userAnswer, String correctAnswer) {
        if (userAnswer.toLowerCase().equals("t")) {
            userAnswer = "True";
        } else if (userAnswer.toLowerCase().equals("f")) {
            userAnswer = "False";
        }
        if (correctAnswer.toLowerCase().equals(userAnswer.toLowerCase())) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect.\n");
            }
    }

    //toString
    @Override
    public String toString() {
        return "True or false: " + question + "\nYour Answer: ";
    }
}
