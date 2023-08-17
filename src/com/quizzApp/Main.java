package com.quizzApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {

           ExecuteService executeService = new ExecuteService();
           executeService.playQuiz();

        }catch(Exception e){
            System.out.println("something went wrong!");
        }
    }
}
