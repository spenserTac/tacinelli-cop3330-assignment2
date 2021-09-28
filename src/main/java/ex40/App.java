package ex40;

import java.util.*;

public class App {
    public static void main(String[] args){
        Map<String, String[]> data =
                new HashMap<String, String[]>();

        String[] john_johnson = {"Manager", "2016-12-31"};
        data.put("John Johnson", john_johnson);

        String[] tou_xiong = {"Software Engineer", "2016-10-05"};
        data.put("Tou Xiong", tou_xiong);

        String[] michaela_michaelson = {"District manager", "2015-12-19"};
        data.put("Michaela Michaelson", michaela_michaelson);

        String[] jake_jacobson = {"Programmer", ""};
        data.put("Jake Jacobson", jake_jacobson);

        String[] jacquelyn_jackson = {"DBA", ""};
        data.put("Jacquelyn Jackson", jacquelyn_jackson);

        String[] sally_webber = {"Web Developer", "2015-12-18"};
        data.put("Sally Webber", sally_webber);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a search string: ");
        String name = scanner.nextLine();

        System.out.println("Results:\nName                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        for(Map.Entry<String, String[]> person : data.entrySet()){
            if(person.getKey().toLowerCase().contains(name)){
                System.out.println(person.getKey() + "\t\t| " + person.getValue()[0] + "\t\t\t| " + person.getValue()[1]);
            }
        }
    }
}