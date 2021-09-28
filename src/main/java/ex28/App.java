/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

package ex28;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            String temp_num = scanner.nextLine();
            int num = Integer.parseInt(temp_num);
            count += num;
        }

        System.out.printf("The total is %d.", count);
    }
}
