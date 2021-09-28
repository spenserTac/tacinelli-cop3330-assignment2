/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

package ex26;

import java.util.Scanner;
import static java.lang.Math.log;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(int bal, float apr_as_percent, int monthly_payment){
        float apr = apr_as_percent/(float)100;

        double n = -(1.0/30.0) * (log(1 + (float)(bal/monthly_payment) * (1 - Math.pow((1 + (apr/365)), 30))) / log(1 + (apr/365)));

        return n;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your balance? ");
        String temp_bal = scanner.nextLine();
        int balance = Integer.parseInt(temp_bal);

        System.out.print("What is the APR on the card (as a percent)? ");
        String temp_percent = scanner.nextLine();
        float percent = Float.parseFloat(temp_percent);

        System.out.print("What is the monthly payment you can make? ");
        String temp_monthly_payment = scanner.nextLine();
        int monthly_payment = Integer.parseInt(temp_monthly_payment);

        double result = calculateMonthsUntilPaidOff(balance, percent, monthly_payment);

        System.out.printf("It will take you %d months to pay off this card.\n", (int)Math.ceil(result));
    }
}
