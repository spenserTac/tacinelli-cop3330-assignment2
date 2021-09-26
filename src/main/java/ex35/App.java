package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            if(name.matches("")){
                break;
            }else{
                names.add(name);
            }
        }

        Random rand = new Random();
        int rand_num = rand.nextInt(names.size());
        System.out.printf("The winner is... %s.\n", names.get(rand_num));
    }
}
