package main;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz myQuiz = new Quiz();

        //create questions
        Question q1 = new TrueFalse();
        q1.question("This is the first question");
        q1.answer("True");
        myQuiz.addQuestionToQuiz(q1);

        Question q2 = new TrueFalse();
        q2.question("This is the third question");
        q2.answer("False");
        myQuiz.addQuestionToQuiz(q2);

        Question q3 = new MultipleChoice();
        q3.question("Which color is yellow?");
        q3.answerChoices("A) Blue");
        q3.answerChoices("B) Yellow");
        q3.answerChoices("C) Green");
        q3.answer("b");
        myQuiz.addQuestionToQuiz(q3);

        Question q4 = new CheckBoxes();
        q4.question("Select fruits:");
        q4.answerChoices("a) banana");
        q4.answerChoices("b) lettuce");
        q4.answerChoices("c) apple");
        q4.answerChoices("d) lemon");
        q4.answer("acd");
        myQuiz.addQuestionToQuiz(q4);

        //present questions to user
        //accept user responses
        System.out.println("Here is your quiz:\n");
        myQuiz.runThruQuiz();

        //tell whether correct or not
        System.out.println("\nHere are your results:\n");
        myQuiz.gradeQuiz();

    }
}
