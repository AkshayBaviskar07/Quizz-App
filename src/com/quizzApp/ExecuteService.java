package com.quizzApp;

public class ExecuteService {

    public void printRules(){
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Point Details: ");
        System.out.println("1. For every correct answer 2 points will be added.");
        System.out.println("2. For wrong answer 1 point will minus.");
        System.out.println("3. Skip a question will not add or minus any point.");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
    }

    public void javaQuiz(){
        QuestionService qService = new QuestionService();
        qService.playQuizz();
        qService.printScore();
    }

    public void csQuiz(){
        CSQuestions csQuestions = new CSQuestions();
        csQuestions.playQuiz();
        csQuestions.printScore();
    }
}
