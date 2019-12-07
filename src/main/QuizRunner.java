package main;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz myQuiz = new Quiz();

        //create questions
        Question q1 = new Question();
        q1.question("What is the first question?", "This is");
        myQuiz.addQuestionToQuiz(q1);

        Question q2 = new Question();
        q2.question("Is this the second question?", "Yes");
        myQuiz.addQuestionToQuiz(q2);

        //present questions to user
        System.out.println("Here is your quiz:\n");
        myQuiz.runThruQuiz();

        //accept user responses
        //tell whether correct or not
        System.out.println("\nHere are your results:\n");
        myQuiz.gradeQuiz();

    }
}
