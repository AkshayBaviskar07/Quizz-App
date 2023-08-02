package com.quizzApp;

import java.util.Scanner;

public class CSQuestions {

    Questions questions[] = new Questions[5];
    String ans[] = new String[5];

    public CSQuestions(){
        questions[0] = new Questions(1, "What is smallest unit of the information?", " a bit", " a nibble", " a byte", " a block", "a");
        questions[1] = new Questions(2, "Which of the following is equal to a gigabyte?", "512 GB", "1024 bytes", "1024 megabytes", "1024 bits", "c");
        questions[2] = new Questions(3, "Who is the father of C language?", "Guido van Rossum", "James Gosling", "Brendan Eich", "Dennis Ritchie", "d");
        questions[3] = new Questions(4, "Which is the fastest type of memory in computer?", "ROM", "Cache Memory", "RAM", "None of the above", "b");
        questions[4] = new Questions(5, "Binary numbers represents by_", "only 0", "1 and 0", "only 1", "None of the above", "b");
    }

    public void displayQuestion(){
        for(Questions que : questions){
            System.out.println(que.getQuestion());
        }
    }

    public void playQuiz(){
        int i=0;

        for(Questions q : questions){       //getting questions, options and answer
            System.out.print("Q"+(i+1)+".");
            System.out.println(q.getQuestion());
            System.out.println("  a."+q.getOpt1());
            System.out.println("  b."+q.getOpt2());
            System.out.println("  c."+q.getOpt3());
            System.out.println("  d."+q.getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.print("Answer: ");
            ans[i] = sc.next();
            i++;

            System.out.println("---------------------------------");
        }
    }

    public void printScore(){
        int score=0;

        for(int i=0; i<questions.length; i++){
            Questions que = questions[i];
            String userAns = ans[i];
            String ans = que.getAnswer();

            if(userAns.equals(ans)){
                score += 2;
            } else{
                score--;
            }
        }

        System.out.println(score);
        System.out.println("---------------------------------");
    }
}
