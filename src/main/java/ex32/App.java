/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

package ex32;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void guess_number(int diff_level){
        Random rand = new Random();
        int number = 0;
        switch(diff_level){
            case 1:
                number = rand.nextInt(10) + 1; // 1-10
                break;
            case 2:
                number = rand.nextInt(100) + 1; // 1-100
                break;
            case 3:
                number = rand.nextInt(1000) + 1; // 1-1000
                break;
        }

        System.out.println("--- " + number + " ---\n");

        Scanner scanner = new Scanner(System.in);


        int num_guesses = 0;


        int guess = 0;
        while(true){
            if(num_guesses == 0){
                while(true){
                    System.out.print("I have my number. What's your guess? ");
                    String temp_guess = scanner.nextLine();

                    if(temp_guess.matches(".*[0-9].*")){
                        guess = Integer.parseInt(temp_guess);
                        break;
                    }else{
                        System.out.println("Enter a number.");
                    }
                }
            }

            if(guess == number){
                System.out.printf("You got it in %d guess!", num_guesses+1);
                return;
            }
            else if(guess < number){

                while(true){
                    System.out.print("Too low. Guess again: ");
                    String temp_guess = scanner.nextLine();

                    if(temp_guess.matches(".*[0-9].*")){
                        guess = Integer.parseInt(temp_guess);
                        break;
                    }else{
                        System.out.println("Enter a number.");
                        num_guesses++;
                    }
                }

                num_guesses++;
            }
            else if(guess > number){
                while(true){
                    System.out.print("Too high. Guess again: ");
                    String temp_guess = scanner.nextLine();

                    if(temp_guess.matches(".*[0-9].*")){
                        guess = Integer.parseInt(temp_guess);
                        break;
                    }else{
                        System.out.println("Enter a number.");
                        num_guesses++;
                    }
                }
                num_guesses++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!\n");

        int diff_level;
        while (true) {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            String temp_level = scanner.nextLine();

            if (temp_level.matches(".*[1-3].*")) {
                diff_level = Integer.parseInt(temp_level);
                break;
            } else {
                System.out.println("Enter either 1, 2, or 3.");
            }
        }

        guess_number(diff_level);
    }
}