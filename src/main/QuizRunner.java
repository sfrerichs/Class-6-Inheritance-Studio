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

//        Question q3 = new MultipleChoice();
//        q3.question("Which color is yellow?\n a) blue\n b) yellow\n c)green", "b");
//        myQuiz.addQuestionToQuiz(q3);

        //present questions to user
        //accept user responses
        System.out.println("Here is your quiz:\n");
        myQuiz.runThruQuiz();

        //tell whether correct or not
        System.out.println("\nHere are your results:\n");
        myQuiz.gradeQuiz();

    }
}
