package main;

public class Question {

    String question;
    String correctAnswer;

    //constructor
    public void question(String aQuestion, String aAnswer) {
        question = aQuestion;
        correctAnswer = aAnswer;
    }

    //toString

    @Override
    public String toString() {
        return question + "\nYour Answer: ";
    }


    //getters and setters

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
