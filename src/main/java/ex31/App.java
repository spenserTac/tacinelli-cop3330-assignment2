package ex31;

import java.util.Scanner;

public class App {
    public static int karvonen_heart_rate(int pulse, int age, double intensity){
            float target_heart_rate = ((((220 - age) - pulse) * (float)(intensity/100.0)) + pulse);
            int result = Math.round(target_heart_rate);

            return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pulse_rate, age;

        while(true) {
            System.out.print("Resting Pulse: ");
            String temp_pulse_rate = scanner.nextLine();
            System.out.print("Age: ");
            String temp_age = scanner.nextLine();

            if(temp_pulse_rate.matches(".*[0-9].*") && temp_age.matches(".*[0-9].*")){
                pulse_rate = Integer.parseInt(temp_pulse_rate);
                age = Integer.parseInt(temp_age);
                break;
            }else{
                System.out.println("Make sure you inputs are numbers.");
            }
        }

        System.out.printf("Resting Pulse: %d\t Age: %d\n\n", pulse_rate, age);

        System.out.println("Intensity\t | Rate");
        System.out.println("-------------|--------");

        for(int i = 55; i <= 95; i += 5){

            int result = karvonen_heart_rate(pulse_rate, age, i);
            System.out.printf("%d%% \t\t | %d bpm\n", i, result);
        }

    }
}
