/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

package ex29;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class App {
    public static int investment_return(String r){
        int ireturn = Integer.parseInt(r);
        int years = 72/ireturn;

        return years;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String temp_return;

        while(true){
            System.out.print("What is your rate of return? ");
            temp_return = scanner.nextLine();
            if(temp_return.matches("0") || temp_return.matches(".*[1-9].*") == false){
                System.out.println("Sorry. That's not a valid input.");
            }else{
                break;
            }
        }

        int years = investment_return(temp_return);
        System.out.printf("It will take %d years to double your initial investment.", years);
    }
}

//class AppTest {
//
//    @Test
//    void investment_return() {
//        int result = App.investment_return("4");
//        Assertions.assertEquals(18, result);
//    }
//}
