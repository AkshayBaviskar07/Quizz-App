package com.quizzApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionService qService = new QuestionService();

        System.out.println("Enter your name: ");
        String pName = sc.next();

        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Point Details: ");
        System.out.println("1. For every correct answer 2 points will be added.");
        System.out.println("2. For wrong answer 1 point will minus.");
        System.out.println("3. Skip a question will not add or minus any point.");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

        String ans;
       do{
           qService.playQuizz();

           System.out.print(pName+" your score is: ");
           qService.printScore();

           System.out.println("Do you want to play more: (y/n)");
           ans = sc.next();

           if(ans.equals("n")){
               System.out.println(pName+" Thanks for playing  ");
           }
           System.out.println("----------------------------------");
       }while(ans.equals("y"));
    }
}
