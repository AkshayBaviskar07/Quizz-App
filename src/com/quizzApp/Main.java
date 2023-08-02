package com.quizzApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExecuteService executeService = new ExecuteService();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String pName = sc.next();

        System.out.println("  Welcome "+pName+" to Quiz App.");
        System.out.println("----------------------------------");

        String ans;
        do{
            System.out.println("Which quiz do you want to take? \n1.Java Quiz \n2.CS Fundamentals");
            int choice = sc.nextInt();
            executeService.printRules();

            switch(choice){
                case 1:
                    executeService.javaQuiz();
                    break;

                case 2:
                    executeService.csQuiz();
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Do you want to play again (y/n)");
            ans = sc.next();

            if(ans.equals("n")){
                System.out.println("Thanks for playing");
            }
        }while(ans.equals("y"));
    }
}
