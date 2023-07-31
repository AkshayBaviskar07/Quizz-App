package com.quizzApp;

public class Main {
    public static void main(String[] args) {
        QuestionService qService = new QuestionService();

        //qService.displayQuestions();
        qService.playQuizz();
        qService.printScore();
    }
}
