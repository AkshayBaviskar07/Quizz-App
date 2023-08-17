package com.quizzApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecuteService {

       public void printRules(){
        System.out.println("----------------------------------");
        System.out.println("Point Details: ");
        System.out.println("1. For every correct answer (+2) points.");
        System.out.println("2. For wrong answer (-1) point..");
        System.out.println("3. Skip a question will not add or minus any point.");
        System.out.println("----------------------------------");
    }

    public void playQuiz(){
           try{
               Scanner sc = new Scanner(System.in);

               System.out.println("Enter User Name: ");
               String userName = sc.nextLine();

               System.out.println("Enter Password (do not include space): ");
               String userPassword = sc.next();
               System.out.println("----------------------------------");

               System.out.println("  Welcome " + userName + " to Quiz App.");
               System.out.println("----------------------------------");
               printRules();

               String ans;
               int count = 0;

               try{
                  do{
                      System.out.println("Which quiz do you want to take? \n1.Java Quiz \n2.CS Fundamentals");
                      int choice = sc.nextInt();

                      QuestionService questionService = new QuestionService(choice);

                      while(count <= 3){
                          System.out.println("Enter password: ");
                          String pass = sc.next();

                          if(pass.equals(userPassword)){
                              questionService.playQuiz();
                              questionService.printScore();
                              break;

                          } else{
                              count++;
                              System.out.println("Invalid password.");
                          }
                      }

                      System.out.println("Do you want to play again (y/n)");
                      ans = sc.next();

                      if (ans.equals("n")) {
                          System.out.println("Thanks for playing");
                      }
                  }while(ans.equals("y"));

               }catch(InputMismatchException ie){
                   System.out.println("Invalid input type.");
               }
           }catch(Exception e){
               System.out.println("Something went wrong!!");
               e.printStackTrace();
           }
    }
}
