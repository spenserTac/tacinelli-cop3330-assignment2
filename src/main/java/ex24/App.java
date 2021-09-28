/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

package ex24;

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

    public static boolean isAnagram(String string1, String string2){
        char str2[] = string2.toCharArray();
        String reversed = "";
        for(int i = str2.length-1; i >= 0; i--){
            reversed += str2[i];
        }

        if(string1.length() == string2.length() && string1.equals(reversed)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", string1, string2);
            return true;
        } else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", string1, string2);
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        boolean result = isAnagram(string1, string2);
    }
}
