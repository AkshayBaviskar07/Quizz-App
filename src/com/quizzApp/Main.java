package com.quizzApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ExecuteService executeService = new ExecuteService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name: ");
        String userName = sc.nextLine();

        System.out.println("Enter Password (do not include space): ");
        String userPassword = sc.next();
        System.out.println("----------------------------------");

        System.out.println("  Welcome "+userName+" to Quiz App.");
        System.out.println("----------------------------------");

        String ans;
        do{
            System.out.println("Which quiz do you want to take? \n1.Java Quiz \n2.CS Fundamentals");
            int choice = sc.nextInt();
            executeService.printRules();

            switch(choice){
                case 1:
                    System.out.println("Enter Password: ");
                    String password = sc.next();
                    System.out.println("----------------------------------");

                    if(password.equals(userPassword)){
                        executeService.javaQuiz();
                    } else{
                        System.out.println("Enter valid password");
                        System.out.println("----------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("Enter Password: ");
                    password = sc.next();

                    if(password.equals(userPassword)){
                        executeService.csQuiz();
                    } else{
                        System.out.println("Enter valid password");
                    }
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
