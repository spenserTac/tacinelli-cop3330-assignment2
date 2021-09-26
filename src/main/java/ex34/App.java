package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList<String> employees = new ArrayList<String>();

        employees.add("Walter White");
        employees.add("Jessie Pinkman");
        employees.add("Saul Goodman");
        employees.add("Mike Ehrmantraut");
        employees.add("Gustavo Fring");

        System.out.printf("There are %d employees:\n", employees.size());
        for(int i = 0; i < employees.size(); i++){
            System.out.printf("%s\n", employees.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an employee name to remove: ");
        String remove_name = scanner.nextLine();

        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).matches(remove_name)){
                employees.remove(i);
            }
        }

        System.out.printf("\nThere are %d employees:\n", employees.size());
        for(int i = 0; i < employees.size(); i++){
            System.out.printf("%s\n", employees.get(i));
        }
    }
}
