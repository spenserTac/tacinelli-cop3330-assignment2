/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

package ex33;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        String[] responses = {
                "Yes",
                "No",
                "Maybe",
                "Ask again later."
        };

        Random rand = new Random();
        int random_number = rand.nextInt(4); // random number between 0-3

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your question?");
        System.out.print("> ");
        String user_response = scanner.nextLine();

        System.out.println(responses[random_number]);
    }
}
