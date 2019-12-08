package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    ArrayList<Question> questions = new ArrayList<Question>();
    ArrayList<String> userAnswers = new ArrayList<String>();

    //add questions
    public void addQuestionToQuiz(Question aQuestion) {
        questions.add(aQuestion);
    }

    //run quiz
    public void runThruQuiz() {
        for (Question question : questions) {
            System.out.println(question);
            Scanner myAns = new Scanner(System.in);
            String myAnswer = myAns.nextLine();
            userAnswers.add(myAnswer);
        }
    }

    //grade quiz
    public void gradeQuiz() {
        for( int i = 0; i < userAnswers.size(); i++) {
            String thisCorrectAnswer = questions.get(i).getCorrectAnswer();
            String thisUserAnswer = userAnswers.get(i);
            System.out.println(questions.get(i) + thisUserAnswer + "\nCorrect Answer: " + thisCorrectAnswer);
            questions.get(i).grader(thisUserAnswer, thisCorrectAnswer);
//            if (thisCorrectAnswer.toLowerCase().equals(thisUserAnswer.toLowerCase())) {
//                System.out.println("Correct!\n");
//            } else {
//                System.out.println("Incorrect.\n");
//            }
        }
    }

    //getters and setters

    public ArrayList<String> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(ArrayList<String> userAnswers) {
        this.userAnswers = userAnswers;
    }
}
