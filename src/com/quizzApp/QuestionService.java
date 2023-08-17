package com.quizzApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestionService {

    Questions questions[] = new Questions[5];
    String answer[] = new String[5];
    int score;
    String skipQue;

    public QuestionService(int choice){
        if(choice == 1){
            questions[0] = new Questions(1, "Instance variable will allocate memory in ", "stack", "heap", "ram", "cache", "b");
            questions[1] = new Questions(2, "String compareTo() returns", "true", "false", "an int value", "none of the above", "c");
            questions[2] = new Questions(3, "Size of double data type", "2", "4", "8", "1", "c" );
            questions[3] = new Questions(4, "Which keyword allocates memory in heap?", "this", "new", "super", "static", "b");
            questions[4] = new Questions(5, "Arrays in java are_", "Object reference", "Objects", "Primitive data type", "none of the above", "b");
        }

        if(choice == 2){
            questions[0] = new Questions(1, "What is smallest unit of the information?", " a bit", " a nibble", " a byte", " a block", "a");
            questions[1] = new Questions(2, "Which of the following is equal to a gigabyte?", "512 GB", "1024 bytes", "1024 megabytes", "1024 bits", "c");
            questions[2] = new Questions(3, "Who is the father of C language?", "Guido van Rossum", "James Gosling", "Brendan Eich", "Dennis Ritchie", "d");
            questions[3] = new Questions(4, "Which is the fastest type of memory in computer?", "ROM", "Cache Memory", "RAM", "None of the above", "b");
            questions[4] = new Questions(5, "Binary numbers represents by_", "only 0", "1 and 0", "only 1", "None of the above", "b");
        }
    }

    public void displayQuestions(){
        for(Questions question:questions){
            System.out.println(question.getQuestion());
            System.out.println(question.getAnswer());
        }
    }

    public void playQuiz() {
        int i = 0;

       try{
           for (Questions que : questions) {

               System.out.print("Q"+(i+1+"."));
               System.out.println(que.getQuestion());
               System.out.println("   a." + que.getOpt1());
               System.out.println("   b." + que.getOpt2());
               System.out.println("   c." + que.getOpt3());
               System.out.println("   d." + que.getOpt4());

               Scanner sc = new Scanner(System.in);
               try{
                   System.out.println("Do you want to skip question (y/n)");
                   skipQue = sc.next();

                   if(skipQue.equalsIgnoreCase("y")){
                       score = 0;
                       if(skipQue!=null && !skipQue.isEmpty()){
                           answer[i] = skipQue;
                       }
                       i++;
                       continue;
                   }

               }catch(InputMismatchException ie){
                   System.out.println("Invalid input.");
               }

               System.out.print("Answer: ");
               answer[i] = sc.next().trim();
               i++;
           }
           System.out.println("---------------------------------");

       }catch(NullPointerException ne){
           ne.getMessage();
       }catch(Exception e){
           System.out.println("Something went wrong.");
       }
    }

    public void printScore() {
        this.score=0;
        try {
            for (int i = 0; i < questions.length; i++) {
                Questions q = questions[i];
                String selAns = answer[i];
                String ans = q.getAnswer();

                if (selAns.equals(ans)){
                    score += 2;
                } else{
                    if (score <= 0)
                        score = 0;
                    else
                        score--;
                }
            }

            System.out.println("Score: " + score);
            System.out.println("----------------------------------");
        }catch(NullPointerException ne){
            ne.getMessage();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}