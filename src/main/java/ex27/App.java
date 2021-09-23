package ex27;

import java.util.Scanner;

public class App {
    public static boolean first_name_validation(String name){
        if(name.length() == 0){
            System.out.println("The first name must be filled in.");
            return false;
        }

        return true;
    }

    public static boolean last_name_validation(String name){
        if(name.length() == 0){
            System.out.println("The last name must be filled in.");
            return false;
        }
        return true;
    }

    public static boolean names_filled_validation(String fname, String lname){
        int c = 0;
        if(fname.length() < 2){
            System.out.println("The first name must be at least 2 characters long.");
            c++;
        }
        else if(lname.length() < 2){
            System.out.println("The last name must be at least 2 characters long.");
            c++;
        }

        if(c > 0){
            return false;
        }

        return true;
    }

    public static boolean id_validation(String id){
        if(id.substring(0, 2).matches(".*[a-zA-Z].*")){
            if(id.substring(2, 3).matches(".*[-].*")){
                if(id.substring(3, 7).matches(".*[0-9].*")){
                }else{
                    System.out.println("The employee ID must be in the format of AA-1234.");
                }
            }else{
                System.out.println("The employee ID must be in the format of AA-1234.");
            }
        }else{
            System.out.println("The employee ID must be in the format of AA-1234.");
        }

        return true;
    }

    public static boolean zipcode_validation(String zip){
        if(zip.matches(".*[0-9].*") && zip.length() == 5){
        }else{
            System.out.println("The zipcode must be a 5 digit number.");
        }
        return true;
    }

    public static void validateInput(String first_name, String last_name, String zip_code, String employee_id){
        boolean res1 = first_name_validation(first_name);
        boolean res2 = last_name_validation(last_name);
        boolean res3 = names_filled_validation(first_name, last_name);
        boolean res4 = id_validation(employee_id);
        boolean res5 = zipcode_validation(zip_code);

        if(res1 && res2 && res3 && res4 && res5){
            System.out.println("There were no errors found.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String first_name = scanner.nextLine();

        System.out.print("Enter the last name: ");
        String last_name = scanner.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zip_code = scanner.nextLine();

        System.out.print("Enter the employee ID: ");
        String employee_id = scanner.nextLine();

        validateInput(first_name, last_name, zip_code, employee_id);
    }
}
