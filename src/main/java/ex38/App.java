package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<String> filterEvenNumbers(String[] nums){
        ArrayList<String> new_nums = new ArrayList<String>();

        for(String num: nums){
            int actual_int = Integer.parseInt(num);
            if(actual_int % 2 == 0){
                new_nums.add(num);
            }
        }

        return new_nums;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String temp_nums = scanner.nextLine();

        String[] nums = temp_nums.split(" ");

        ArrayList<String> new_nums = new ArrayList<String>();
        new_nums = filterEvenNumbers(nums);

        System.out.print("The even numbers are ");
        for(String num: new_nums){
            System.out.printf("%s ", num);
        }
        System.out.print(".");
    }
}
