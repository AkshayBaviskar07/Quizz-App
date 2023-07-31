package com.quizzApp;

import java.util.Scanner;

public class QuestionService {

    Questions questions[] = new Questions[5];
    String answer[] = new String[5];

    public QuestionService(){
        questions[0] = new Questions(1, "Instance variable will allocate memory in ", "stack", "heap", "ram", "cache", "heap");
        questions[1] = new Questions(2, "Can we instantiate an abstract class?", "No", "Yes", "No");
        questions[2] = new Questions(3, "Size of double data type", "2", "4", "8", "1", "8" );
        questions[3] = new Questions(4, "Which keyword allocates memory in heap?", "this", "new", "super", "static", "new");
        questions[4] = new Questions(5, "Static method can invoke using class name?", "true", "false", "true");
    }

    public void displayQuestions(){
        for(Questions question:questions){
            System.out.println(question.getQuestion());
            System.out.println(question.getAnswer());
        }
    }

    public void playQuizz() {
        int i = 0;

        for (Questions que : questions) {
            System.out.print("Q" + (i + 1) + ".");
            System.out.println(que.getQuestion());
            System.out.println("a." + que.getOpt1());
            System.out.println("b." + que.getOpt2());
            System.out.println("c." + que.getOpt3());
            System.out.println("d." + que.getOpt4());

            System.out.print("Answer: ");
            Scanner sc = new Scanner(System.in);
            answer[i] = sc.nextLine().trim();
            i++;
            System.out.println("---------------------------------");
        }
    }

    public void printScore(){
        int score=0;
//        for(String ans : answer){
//            System.out.println(ans);
//        }

        for(int i=0; i<questions.length; i++){
           Questions q = questions[i];
            String ans = q.getAnswer();
            String selAnswer = answer[i];

            if(selAnswer.equals(ans)){
                score+=2;
            } else {
                score--;
            }
        }

        System.out.println("Result: "+score);
    }
}