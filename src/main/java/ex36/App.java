/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */
package ex36;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static float average(ArrayList<Integer> nums){
        int total = 0;
        for(int i: nums){
            total += i;
        }
        float result = total/nums.size();

        System.out.printf("The average is %.1f\n", result);

        return result;
    }

    public static int min(ArrayList<Integer> nums){
        int smallest = nums.get(0);
        for(int i: nums){
            if(i < smallest){
                smallest = i;
            }
        }

        System.out.printf("The minimum is %d\n", smallest);

        return smallest;
    }

    public static int max(ArrayList<Integer> nums){
        int largest = nums.get(0);
        for(int i: nums){
            if(i > largest){
                largest = i;
            }
        }

        System.out.printf("The maximum is %d\n", largest);

        return largest;
    }

    public static double std(ArrayList<Integer> nums){
        double numerator = 0;
        int total = 0;
        for(int i: nums){
            total += i;
        }
        float avg = total/nums.size();

        for(int i: nums){
            numerator += Math.pow(i - avg, 2);
        }
        double result = Math.sqrt(numerator/nums.size());

        System.out.printf("The standard deviation is %.2f\n", result);

        return result;
    }


    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();

        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String temp_num = scanner.nextLine();
            int num = 0;


            if(temp_num.matches("done")){
                break;
            }
            else if(!temp_num.matches(".*[0-9].*")){
            } else{
                num = Integer.parseInt(temp_num);
                nums.add(num);
            }
        }

        for(int i = 0; i < nums.size(); i++){
            if(i < nums.size()-1){
                System.out.printf("%d,", nums.get(i));
            }
            else if(i == nums.size()-1){
                System.out.printf("%d\n", nums.get(i));
            }
        }

        average(nums);
        min(nums);
        max(nums);
        std(nums);
    }
}
