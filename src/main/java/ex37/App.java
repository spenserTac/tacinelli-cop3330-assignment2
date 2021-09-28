/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

package ex37;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int length, schars, nums;

        while(true) {
            System.out.print("What's the minimum length? ");
            String temp_length = scanner.nextLine();
            length = Integer.parseInt(temp_length);

            System.out.print("How many special characters? ");
            String temp_schars = scanner.nextLine();
            schars = Integer.parseInt(temp_schars);

            System.out.print("How many numbers? ");
            String temp_nums = scanner.nextLine();
            nums = Integer.parseInt(temp_nums);

            if(length >= (schars + nums)){
                break;
            }
        }

        Random rand = new Random();
        ArrayList<String> letters = new ArrayList<String>();
        String special_chars = "!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";


        for(int i = 0; i < (length - (schars + nums)); i++){
            int random_int = rand.nextInt(26); // random int 0-25
            //letters.add(random_int);
            letters.add(Character.toString(alphabet.charAt(random_int)));
        }

        for(int j = 0; j < schars; j++){
            int random_int = rand.nextInt(31); // random int 0-30
            letters.add(Character.toString(special_chars.charAt(random_int)));
        }

        for(int k = 0; k < nums; k++){
            int random_int = rand.nextInt(10); // random int 0-9
            letters.add(String.valueOf(random_int));
        }

        System.out.print("Your password is ");
        for(String i: letters){
            System.out.printf("%s", i);
        }

    }
}
