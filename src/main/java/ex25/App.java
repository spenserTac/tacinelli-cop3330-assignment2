package ex25;

import java.util.Scanner;

/*
 *
 * Write a test for this program!!!
 *
 * */

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

public class App {
    public static int passwordValidator(String password){
        //char password[] = users_password.toCharArray();
        boolean num_count = false;
        boolean str_count = false;
        boolean special_characters = false;
        int result = 0;

        if(password.matches(".*[a-zA-Z].*")){
            str_count = true;
        }
        if(password.matches(".*[0-9].*")){
            num_count = true;
        }
        if(password.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*")){
            special_characters = true;
        }

        if(num_count && password.length() > 8){
            if(str_count){
                if(special_characters){
                    result = 4;
                }
                else{
                    result = 3;
                }
            }
        }

        if(num_count && str_count == false && special_characters == false && password.length() < 8){
            result = 1;
        }

        if(str_count && num_count == false && special_characters == false && password.length() < 8){
            result = 2;
        }

        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        int password_strength = passwordValidator(password);

        switch(password_strength){
            case 1:
                System.out.printf("The password \'%s\' is a very weak password", password);
                break;
            case 2:
                System.out.printf("The password \'%s\' is a weak password", password);
                break;
            case 3:
                System.out.printf("The password \'%s\' is a strong password", password);
                break;
            case 4:
                System.out.printf("The password \'%s\' is a very strong password", password);
                break;
        }
    }
}
